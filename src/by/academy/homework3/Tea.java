package by.academy.homework3;

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

    @Override
    public double discount() {
        if (quantity < 10) {
            return 1;
        } else if (quantity < 30) {
            return 0.6;
        } else {
            return 0.3;
        }
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
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

