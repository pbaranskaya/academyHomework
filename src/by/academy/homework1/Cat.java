package by.academy.homework1;
import java.math.BigDecimal;

public class Cat {

    int age;

    String nickname;
    BigDecimal money;
    char initials;
    boolean isHomeAnimal = true;

    public void grow() {
        age++;
    }

    public void sleep() {
        System.out.print("кот " + nickname + " спит, ");
    }

    public void eat() {
        System.out.print("кот " + nickname + " ест, ");
    }

    public void walk() {
        System.out.print("кот " + nickname + " гуляет");
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setInitials(char initials) {
        this.initials = initials;
    }

    public char getInitials() {
        return initials;
    }


    public void setIsHomeAnimal(boolean isHomeAnimal) {
        this.isHomeAnimal = isHomeAnimal;
    }


    public void isHomeAnimal() {
        System.out.print(isHomeAnimal ? " домашний, " : " недомашний, ");
    }

    public Cat() {
        super();
    }

    public Cat(String nickname) {
        super();
        this.nickname = nickname;
    }
}
