package by.academy.homework3;

public class Berry extends Product {

    private String taste;
    private String color;

    public Berry () {
        super();
    }

    public Berry (String name, double price, double quantity, String taste, String color) {
        super(name, price, quantity);
        this.taste = taste;
        this.color = color;
    }

    @Override
    public double discount() {
        if (quantity < 10) {
            return 1;
        } else if (quantity < 20) {
            return 0.8;
        } else {
            return 0.75;
        }
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Berry{" +
                "taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
