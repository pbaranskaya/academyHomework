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
    private static final DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern
            ("День: dd Месяц: MM Год: yyyy", Locale.US);

    public static void main(String[] args) {

        Deal deal = new Deal();
        System.out.println("Добро пожаловать в магазин");

        while (true) {
            printMainMenu(sc);
            String action = sc.next();

            switch (action) {
                case "1":
                    System.out.println("Создаем продавца");
                    deal.setSeller(createUser(sc));
                    continue;
                case "2":
                    System.out.println("Создаем покупателя");
                    deal.setBuyer(createUser(sc));
                    continue;
                case "3":
                    while (true) {
                        Product p = createProduct(sc);
                        if (p != null) {
                            deal.add(p);
                        } else {
                            break;
                        }
                    }
                    continue;
                case "4":
                    System.out.println("Корзина:");
                    deal.printProducts();
                    continue;
                case "5":
                    System.out.println("Удалить позицию");
                    deal.deleteProduct(sc.nextInt() - 1);
                    continue;
                case "0":
                    deal.submit();
                    break;
            }
        }
    }

    public static void printMainMenu(Scanner sc) {

        System.out.println("Выберите действие: ");
        System.out.println("1 - Создание продавца 2 - Создание покупателя 3 - Выбор продукта");
        System.out.println("4 - Просмотр товаров  5 - Удаление товара     0 - Завершить сделку");
    }

    public static Product createProduct(Scanner sc) {

        System.out.println("Введите номер продукта для покупки");
        System.out.print("я - ягода, т - торт, ч - чай, stop - закончить сбор корзины: ");
        Product product = null;

        switch (sc.next().toLowerCase()) {
            case "я":
                System.out.print("Введите количество: ");
                int quantity = sc.nextInt();
                product = new Berry("Клубника", 1, quantity, "сладкая", "красная");
                System.out.println(product);
                break;
            case "т":
                System.out.print("Введите количество: ");
                quantity = sc.nextInt();
                product = new Cake("Наполеон", 2, quantity, "2 слоя", "с кремом");
                System.out.println(product);
                break;
            case "ч":
                System.out.print("Введите количество: ");
                quantity = sc.nextInt();
                product = new Tea("Липтон", 3, quantity, "холодный", "с бергамотом");
                System.out.println(product);
                break;
            case "stop":
                System.out.println("Корзину собрали");
                break;
            default:
                System.out.println("Not valid choice");
        }
        return product;
    }


    public static User createUser(Scanner sc) {

        System.out.print("Ввод имени: ");
        String name = sc.next();

        System.out.print("Ввод email: ");
        String email = null;
        while (email == null) {
            email = sc.next();
            if (!EMAIL_VALIDATOR.validate(email)) {
                email = null;
                System.out.println("Неверный email");
            }
        }

        System.out.print("Ввод телефона: ");
        String phone = null;
        while (phone == null) {
            phone = sc.next();
            if (!PHONE_VALIDATOR.validate(phone)) {
                phone = null;
                System.out.println("Неверный телефон");
            }
        }

        sc.nextLine();

        System.out.print("Ввод даты рождения: ");
        LocalDate date = null;
        while (date == null) {
            String dateStr = sc.nextLine();
            if (date1.validate(dateStr)) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                        "dd/MM/yyyy", Locale.US);
                date = LocalDate.parse(dateStr, formatter);
                System.out.println(date.format(newFormatter));
            } else if (date2.validate(dateStr)) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                        "dd-MM-yyyy", Locale.US);
                date = LocalDate.parse(dateStr, formatter);
                System.out.println(date.format(newFormatter));
            } else {
                date = null;
                System.out.println("Неправильная дата");
            }
        }

        System.out.print("Кошелек: ");
        double money = sc.nextDouble();

        User user = new User(name, money, date, phone, email);
        return user;
    }
}