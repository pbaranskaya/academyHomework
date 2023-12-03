package by.academy.homework3;

// черновик

public class Tea extends Product {

    String temperature;
    String type;

    public Tea () {
        super();
    }

    public Tea (String name, double price, double quantity,
                String temperature, String type) {
        super(name, price, quantity);
        this.temperature = temperature;
        this.type = type;
    }


}

