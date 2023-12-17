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
    public double discount(){ // if taste - кислый = return 0.8

        return 0;
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
