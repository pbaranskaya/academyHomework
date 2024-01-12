package by.academy.homework4.Task1;

import java.util.Scanner;

public class CreateDateMethods {

    private static final DateValidator DATE_VALIDATOR = new DateValidator();
    private static final Scanner sc = new Scanner(System.in);

    public static CustomDate createDate_method1(Scanner sc) {
        CustomDate CustomDate = null;
        System.out.print("Введите дату: ");
        String strDate = sc.next();
        if (DATE_VALIDATOR.validate(strDate)) {
            CustomDate = new CustomDate(strDate);
            System.out.println("Год: " + CustomDate.getYear().value);
            System.out.println("Месяц: " + CustomDate.getMonth().value);
            System.out.println("День месяца: " + CustomDate.getDay().value);
        } else {
            System.out.println("Дата введена неверно. Повторите ввод");
        }
        return CustomDate;
    }

    public static CustomDate createDate_method2(Scanner sc) {

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
}
