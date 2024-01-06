package by.academy.homework4.Task1;

import java.time.LocalDate;
import java.util.Scanner;

public class CustomDateApp {

    private static final DateValidator DATE_VALIDATOR = new DateValidator();
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

        daysInPeriod(CustomDate1,CustomDate2);
    }

    private static CustomDate createDate_method1(Scanner sc) {
        CustomDate CustomDate = null;
        System.out.print("Введите дату: ");
        String strDate = CustomDateApp.sc.next();
        if (DATE_VALIDATOR.validate(strDate)) {
            CustomDate = new CustomDate(strDate);
            System.out.println("Год: " + CustomDate.getYear().value);
            System.out.println("Месяц: " + CustomDate.getMonth().value);
            System.out.println("День месяца: " + CustomDate.getDay().value);
            CustomDate.enumDayOfWeek();
        } else {
            System.out.println("Дата введена неверно. Повторите ввод");
        }
        return CustomDate;
    }

    private static CustomDate createDate_method2(Scanner sc) {

        int year = 0;
        int month = 0;
        int day = 0;

        System.out.print("Введите год:");
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                year = sc.nextInt();
                break;
            } else {
                System.out.println("Введен некорректный год. Повторите ввод");
                sc.next();
            }
        }

        System.out.print("Введите месяц:");
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                month = sc.nextInt();
                if (month < 1 || month > 12) {
                    System.out.println("Месяц может быть числом от 1 до 12 включительно");
                } else {
                    break;
                }
            } else {
                System.out.println("Введен некорректный месяц");
                sc.next();
            }
        }

        System.out.print("Введите день месяца:");
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                day = sc.nextInt();
                if (day < 1 || day > 31) {
                    System.out.println("День может быть числом от 1 до 31 включительно");
                } else {
                    break;
                }
            } else {
                System.out.println("Введен некорректный день месяца");
                sc.next();
            }
        }

        CustomDate CustomDate = new CustomDate(year, month, day);
        return CustomDate;
    }

    public static void daysInPeriod(CustomDate end, CustomDate start){
        LocalDate endDate = end.toLocalDate();
        LocalDate startDate = start.toLocalDate();
        int period = (int) Math.abs((endDate.toEpochDay()) - startDate.toEpochDay());
        System.out.println("Количество дней в промежутке между датой 1 и датой 2: " + period);
    }

    public static boolean isleapYear(CustomDate customDate) {
        if (((customDate.year.value % 4 == 0) && (customDate.year.value  % 100 != 0)) ||
                (customDate.year.value  % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}