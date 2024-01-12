package by.academy.homework4.Task1;

import java.util.Scanner;
import static by.academy.homework4.Task1.CreateDateMethods.createDate_method1;
import static by.academy.homework4.Task1.CreateDateMethods.createDate_method2;
import static by.academy.homework4.Task1.CustomDate.calculateDays;
import static by.academy.homework4.Task1.CustomDate.isleapYear;

public class CustomDateApp {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        CustomDate CustomDate1 = createDate_method1(sc);
        CustomDate1.printDayOfWeek();
        CustomDate1.printCustomDayOfWeek();
        System.out.println(isleapYear(CustomDate1)? "Год даты високосный" : "Год даты невисокосный");

        CustomDate CustomDate2 = createDate_method2(sc);
        CustomDate2.printDayOfWeek();
        CustomDate2.printCustomDayOfWeek();
        System.out.println(isleapYear(CustomDate2)? "Год даты високосный" : "Год даты невисокосный");

        calculateDays(CustomDate1,CustomDate2);
    }
}