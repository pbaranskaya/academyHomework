package by.academy.homework1;
import java.math.BigDecimal;

public class CatApp {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.nickname = "Лапка";
        cat1.age = 5;
        cat1.grow();
        cat1.grow();
        cat1.grow();
        BigDecimal a = new BigDecimal("2000.6");
        cat1.setMoney(a);
        BigDecimal cat1Money = cat1.getMoney();
        System.out.print("У кота " + cat1.nickname + " " + cat1Money + " денег, ");
        System.out.println("возраст кота " + cat1.nickname + " - " + cat1.age);

        Cat cat2 = new Cat("Снежок");
        cat2.setInitials("Снежок".charAt(0));
        char cat2Initials = cat2.getInitials();
        System.out.print("Инициалы кота " + cat2.nickname + " - " + cat2Initials);
        cat2.setIsHomeAnimal(true);
        System.out.print(", кот " + cat2.nickname + " ");
        cat2.isHomeAnimal();
        cat2.eat();
        cat2.sleep();
        cat2.walk();
    }
}
