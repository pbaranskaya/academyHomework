package by.academy.homework3;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

import static by.academy.homework3.DateFormat.dateFormat;
import static by.academy.homework3.DateFormat.dateFormat1;

public class User {

    String name;
    double money;
    LocalDate dateOfBirth;
    String Phone;
    String Email;

    public boolean hasEnoughMoney(double price) {
        return money >= price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Double.compare(money, user.money) == 0 && Objects.equals(name, user.name)
                && Objects.equals(dateOfBirth, user.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money, dateOfBirth);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

