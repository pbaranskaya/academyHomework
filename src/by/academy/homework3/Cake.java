package by.academy.homework3;

// черновик

public class Cake extends Product {

    int tiers;
    String filling;

    public Cake () {
        super();
    }

    public Cake (String name, double price, double quantity,
                 int tiers, String filling) {
        super(name, price, quantity);
        this.tiers = tiers;
        this.filling = filling;
    }


}
