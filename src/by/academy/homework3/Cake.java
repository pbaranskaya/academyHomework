package by.academy.homework3;

// черновик

public class Cake extends Product {

    private int tiers;
    private String filling;

    public Cake () {
        super();
    }

    public Cake (String name, double price, double quantity, int tiers, String filling) {
        super(name, price, quantity);
        this.tiers = tiers;
        this.filling = filling;
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "tiers=" + tiers +
                ", filling='" + filling + '\'' +
                '}';
    }
}
