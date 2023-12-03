package by.academy.homework3;

// черновик

public class Berry extends Product {

    String taste;
    String color;

    public Berry () {
        super();
    }

    public Berry (String name, double price, double quantity,
                  String taste, String color) {
        super(name, price, quantity);
        this.taste = taste;
        this.color = color;
    }

}
