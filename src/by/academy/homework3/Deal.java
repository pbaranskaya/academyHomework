package by.academy.homework3;

// черновик

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Deal {

    User seller;
    User buyer;
    Product[] products;
    LocalDate dealDate;

    public double calculateFullPrice() {
        if (products == null) {
            return 0;
        }

        double result = 0;
        for (Product p : products) {
            result += p.calculatePrice();
        }
        return result;
    }

    public void submit() {
        double price = calculateFullPrice();
        if (buyer.hasEnoughMoney(price)) {
            printBill();
            transferMoney(seller, buyer);
            setDealDate(LocalDate.now());
            System.out.println("Сделка совершена");
        } else {
            System.out.println("У покупателя нет столько денег: " + price);
        }
    }

    private void transferMoney(User seller, User buyer) {
        double fullPrice = 0;
        for (Product p : products) {
            fullPrice += p.calculatePrice();
        }
        buyer.setMoney(buyer.getMoney() - fullPrice);
        seller.setMoney(seller.getMoney() + fullPrice);
    }

    private void printBill() {
        for (Product p : products) {
            System.out.println(p.getName() + p.calculatePrice());
        }
        System.out.println("========");
        double fullPrice = 0;
        for (Product p : products) {
            fullPrice += p.calculatePrice();
        }
        System.out.println("Цена: " + fullPrice);
    }


    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public LocalDate getDealDate() {
        return dealDate;
    }

    public void setDealDate(LocalDate dealDate) {
        this.dealDate = dealDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deal deal = (Deal) o;
        return Objects.equals(seller, deal.seller) && Objects.equals(buyer, deal.buyer) && Arrays.equals(products, deal.products) && Objects.equals(dealDate, deal.dealDate);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(seller, buyer, dealDate);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }

    @Override
    public String toString() {
        return "Deal{" +
                "seller=" + seller +
                ", buyer=" + buyer +
                ", products=" + Arrays.toString(products) +
                ", dealDate=" + dealDate +
                '}';
    }

}
