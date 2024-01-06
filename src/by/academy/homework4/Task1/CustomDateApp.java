package by.academy.homework4.Task1;

import java.time.LocalDate;
import java.util.Scanner;

public class CustomDateApp {

    private static final DateValidator DATE_VALIDATOR = new DateValidator();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int year = 0;
        int month = 0;
        int day = 0;
        Scanner sc = new Scanner(System.in);

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

        CustomDate CustomDate1 = new CustomDate(year, month, day);
        System.out.println("Год " + CustomDate1.year.value + " является високосным: " + CustomDate1.year.isleapYear());

        CustomDate1.printDayOfWeek();
        CustomDate1.printCustomDayOfWeek();

        LocalDate CustomDate2 = LocalDate.now();
        LocalDate endDate = CustomDate1.toLocalDate();
        LocalDate startDate = LocalDate.of(CustomDate2.getYear(), CustomDate2.getMonth(), CustomDate2.getDayOfMonth());
        int period = (int) Math.abs((endDate.toEpochDay()) - startDate.toEpochDay());
        System.out.println("Количество дней в промежутке между датой 1 и датой 2: " + period);

        System.out.println("Введите дату:");

        while (true) {

            String strDate = sc.next();

            if (DATE_VALIDATOR.validate(strDate)) {
                CustomDate CustomDate3 = new CustomDate(strDate);
                System.out.println("Год: " + CustomDate3.getYear().value);
                System.out.println("Месяц: " + CustomDate3.getMonth().value);
                System.out.println("День месяца: " + CustomDate3.getDay().value);
                System.out.println("Год " + CustomDate3.year.value + " является высокосным: "
                        + CustomDate3.year.isleapYear());
                CustomDate3.printDayOfWeek();
                CustomDate3.printCustomDayOfWeek();
            } else {
                System.out.println("Дата введена неверно. Повторите ввод");
            }
        }
    }
}