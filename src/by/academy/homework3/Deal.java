package by.academy.homework3;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Deal {

    private User seller;
    private User buyer;
    private Product[] products;
    private LocalDate dealDate;
    protected final LocalDate deadlineDate = LocalDate.now().plusDays(10);
    private int current;

    public double calculateFullPrice() {
        if (products == null) {
            return 0;
        }
        double result = 0;
        for (Product p : products) {
            if (p == null) {
                continue;
            }
            result += p.calculatePrice();
        }
        return result;
    }

    public void deleteProduct (int index) {
        if (index < 0 || index >= current) {
            System.out.println("Введите правильный индекс");
            return;
        }
        if (index != products.length - 1) {
            System.arraycopy(products, index + 1, products, index, products.length - index - 1);
        }
        products[current-- - 1] = null;
    }


    public void submit() {
        double price = calculateFullPrice();
        if (buyer.hasEnoughMoney(price)) {
            printBill();
            transferMoney(seller, buyer);
//            setDealDate(LocalDate.now());
            System.out.println("Сделка совершена");
        } else {
            System.out.println("У покупателя нет столько денег: " + price);
        }
    }

    private void transferMoney(User seller, User buyer) {
//        double fullPrice = 0;
//        for (Product p : products) {
//            fullPrice += p.calculatePrice();
//        }
        buyer.setMoney(buyer.getMoney() - calculateFullPrice());
        seller.setMoney(seller.getMoney() + calculateFullPrice());
    }

    private void printBill() {
        System.out.println("Чек:");
        for (Product p : products) {
            if (p == null) {
                continue;
            }
            System.out.println("Позиция: " + p + " " + p.calculatePrice() + "$");
        }
//        System.out.println("========");
//        double fullPrice = 0;
//        for (Product p : products) {
//            fullPrice += p.calculatePrice();
//        }
//        System.out.println("Цена: " + fullPrice);
        System.out.println("Цена за все:  " + calculateFullPrice());
        System.out.println("Дата сделки: "+ LocalDate.now());
        System.out.println("Дата дедлайна сделки: " + deadlineDate);
    }

    private void grow() {
        Product[] newProducts = new Product[products.length * 2 + 1];
        System.arraycopy(products, 0, newProducts,0, products.length);
        products = newProducts;
    }

    public void add(Product product) {
        if (products == null) {
            products = new Product[10];
            current = 0;
        }
        if (current >= products.length) {
            grow();
        }
        products[current++] = product;
    }


    public void delete(int index) {
        if (index < 0 || index >= current) {
            System.out.println("Неправильный индекс");
            return;
        }
        if (index != products.length - 1) {
            System.arraycopy(products,index + 1,products,index, products.length - index - 1);
        }
        products[current-- - 1] = null;
    }

    public void printProducts() {
        for (int i = 0; i < current; i++) {
            System.out.println(i + " "  + products[i]);
        }
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
