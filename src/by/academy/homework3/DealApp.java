package by.academy.homework3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class DealApp {
    private static final Validator EMAIL_VALIDATOR = new EmailValidator();
    private static final Validator PHONE_VALIDATOR = new BelarussianPhoneValidator();
    private static final DateValidatorFormat1 date1 = new DateValidatorFormat1();
    private static final DateValidatorFormat2 date2 = new DateValidatorFormat2();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        Deal deal = new Deal();
        System.out.println("Добро пожаловать в магазин");
        while (true) {
            String action = sc.next();
            switch (action) {
                case "1":
                    System.out.println("Создаем продавца");
                    deal.setSeller(createUser(sc));
                case "2":
                    System.out.println("Создаем покупателя");
                    deal.setBuyer(createUser(sc));
                case "3":
                    // распечатать корзину продуктов
                    deal.printProducts();
                case "4":
                    // добавить продукт в сделку
                    Product p = createProduct(sc);
                    if (p != null) {
                        deal.add(p);
                    } else {
                        System.out.println("Зина отмена");
                    }
                case "5":
                    // удалить продукт из сделки
                    deal.deleteProduct(sc.nextInt());
                case "0":
                    // завершить сделку
                    deal.submit();
                    break;
            }
        }
    }


    public static Product createProduct(Scanner sc) {

        System.out.println("Введите номер продукта для покупки");
        System.out.println("1 - ягода, 2 - торт, 3 - чай, 0 - для отмены");
        Product product = null;
        boolean cycle = true;

        switch (sc.next()) {
            case "1":
                System.out.println("Введите количество");
                int quantity = sc.nextInt();
                product = new Berry("Клубника", 1, quantity, "сладкая", "красная");
            case "2":
                System.out.println("Введите количество");
                quantity = sc.nextInt();
                product = new Cake("Наполеон", 2, quantity, "2 слоя", "с кремом");
            case "3":
                System.out.println("Введите количество");
                quantity = sc.nextInt();
                product = new Tea("Кертис", 3, quantity, "холодный", "с бергамотом");
            case "0":
                cycle = false;
        }
        return product;
    }


    public static LocalDate parseFormat1(String date) {
        return LocalDate.now();
    }

    public static LocalDate parseFormat2(String date) {
        return LocalDate.now();
    }


    public static User createUser(Scanner sc) {

        System.out.println("Ввод имени");
        String name = sc.next();

        System.out.println("Ввод email");
        String email = null;
        while (email == null) {

            email = sc.next();
            if (!EMAIL_VALIDATOR.validate(email)) {
                email = null;
                System.out.println("Неверный email");
            }
        }

        System.out.println("Ввод телефона");
        String phone = null;
        while (phone == null) {

            phone = sc.next();
            if (!PHONE_VALIDATOR.validate(phone)) {
                phone = null;
                System.out.println("Неверный телефон");
            }
        }

        System.out.println("Ввод даты рождения");
        LocalDate date = null;
        while (date == null) {
            String dateStr = sc.nextLine();

            if (date1.validate(dateStr)) {
                date = parseFormat1(dateStr);
            } else if (date2.validate(dateStr)) {
                date = parseFormat1(dateStr);
            } else {
                date = null;
                System.out.println("Неправильная дата");
            }
        }

        System.out.println("Ввод дата рождения");

        User user = new User(name, phone, email, date);
        return user;
    }
}



