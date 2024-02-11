package by.academy.homework7.Task2;

//a)Создать свой класс Person с полями: firstName, lastName, age, dateOfBirth
//b)Добавить класс User, который наследуется от Person, с полями: login, password, email
//c)Добавить гетеры, сетеры. Добавить метод printUserInfo в User. Вывести с помощью рефлексии
// все поля и методы, сначала через
//getMethod("name")
//getMethods()
//getField("name")
//getFields()
//а затем через
//getDeclaredMethod("name")
//getDeclaredMethods()
//getDeclaredField("name")
//getDeclaredFields()
//Посмотреть разницу. Просетать все значения через Reflection. (set метод класса Field).
//Вывести значения полей через Reflection. (get метод класса Field). Вызвать toString через invoke.

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        User u = new User();

        Class<User> userClass = User.class;

        try {

            Method printUserInfoMethod = userClass.getMethod("printUserInfo");
            System.out.println(printUserInfoMethod.invoke(u));

            System.out.println("==============");

            Field firstNameField = userClass.getField("firstName");
            firstNameField.set(u, "Polina");
            System.out.println("First name: " + firstNameField.get(u));

            Field lastNameField = userClass.getField("lastName");
            lastNameField.set(u, "Petrova");
            System.out.println("Last name: " + lastNameField.get(u));

            Field ageField = userClass.getField("age");
            ageField.set(u, 48);
            System.out.println("Age: " + ageField.get(u));

            Field dateOfBirthField = userClass.getField("dateOfBirth");
            dateOfBirthField.set(u, "24-01-1764");
            System.out.println("Date of birth: " + dateOfBirthField.get(u));

            Field loginField = userClass.getField("login");
            loginField.set(u, "PolinaP");
            System.out.println("Login: " + loginField.get(u));

            Field passwordField = userClass.getDeclaredField("password");
            passwordField.setAccessible(true);
            passwordField.set(u, "123456");
            System.out.println("Password: " + passwordField.get(u));

            Field emailField = userClass.getDeclaredField("email");
            emailField.setAccessible(true);
            emailField.set(u, "polina@mail.ru");
            System.out.println("E-mail: " + emailField.get(u));

            Method toStringMethod = userClass.getMethod("toString");
            System.out.println(toStringMethod.invoke(u));

        } catch (NoSuchFieldException | SecurityException |
                 IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException | InvocationTargetException |
                 NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}

