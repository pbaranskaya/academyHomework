package by.academy.homework4.Task1;

import java.util.Scanner;
import static by.academy.homework4.Task1.CreateDateMethods.*;
import static by.academy.homework4.Task1.CustomDate.calculateDays;
import static by.academy.homework4.Task1.CustomDate.isleapYear;

public class CustomDateApp {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        CustomDate customDate1 = createDateMethod1(sc);
        customDate1.printDayOfWeek();
        customDate1.printCustomDayOfWeek();
        System.out.println(isleapYear(customDate1) ? "Год даты високосный" : "Год даты невисокосный");

        CustomDate customDate2 = createDateMethod2(sc);
        customDate2.printDayOfWeek();
        customDate2.printCustomDayOfWeek();
        System.out.println(isleapYear(customDate2) ? "Год даты високосный" : "Год даты невисокосный");

        calculateDays(customDate1, customDate2);
    }
}