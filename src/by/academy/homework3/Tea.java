package by.academy.homework3;

// черновик

public class Tea extends Product {

    private String temperature;
    private String type;

    public Tea () {
        super();
    }

    public Tea (String name, double price, double quantity, String temperature, String type) {
        super(name, price, quantity);
        this.temperature = temperature;
        this.type = type;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "temperature='" + temperature + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

