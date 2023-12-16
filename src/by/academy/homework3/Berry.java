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
                '}';
    }
}
