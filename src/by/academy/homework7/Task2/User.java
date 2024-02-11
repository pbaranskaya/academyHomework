package by.academy.homework7.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class User extends Person {

    public String login;
    protected String password;
    private String email;

    public User() {
        super();
    }

    public User(String firstName, String lastName, int age, String dateOfBirth,
                String login, String password, String email) {
        super(firstName, lastName, age, dateOfBirth);
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public void printUserInfo() {

        System.out.println("Метод printUserInfo:");

        Class<User> userClass = User.class;

        try {

            System.out.println("Вывод методов getMethod (name)"); //getMethod используем для public методов
            Method getLoginMethod = userClass.getMethod("getLogin");
            System.out.println(getLoginMethod);

            System.out.println("Вывод методов getMethods()"); //getMethods используем для public методов
            Method[] methods = userClass.getMethods();
            for (Method method : methods) {
                System.out.println(method);
            }

            System.out.println("Вывод полей getField (name)"); //getField используем для public полей
            Field loginField = userClass.getField("login");
            System.out.println(loginField);

            System.out.println("Вывод полей getFields()"); //getFields используем для public полей
            Field[] fields = userClass.getFields();
            for (Field field : fields) {
                System.out.println(field);
            }

            System.out.println("Вывод методов getDeclaredMethod(name)"); //getDeclaredMethod используем для всех методов
            Method getLoginDeclaredMethod = userClass.getDeclaredMethod("getLogin");
            System.out.println(getLoginDeclaredMethod);
            Method getPasswordDeclaredMethod = userClass.getDeclaredMethod("getPassword");
            System.out.println(getPasswordDeclaredMethod);
            Method getEmailDeclaredMethod = userClass.getDeclaredMethod("getEmail");
            System.out.println(getEmailDeclaredMethod);

            Method[] declaredMethods = userClass.getDeclaredMethods(); //getDeclaredMethod используем для всех методов
            for (Method method : declaredMethods) {
                System.out.println(method);
            }

            System.out.println("Вывод полей getDeclaredField (name)"); //getDeclaredField используем для всех полей
            Field loginDeclaredField = userClass.getDeclaredField("login");
            System.out.println(loginDeclaredField);
            Field passwordDeclaredField = userClass.getDeclaredField("password");
            System.out.println(passwordDeclaredField);
            Field emailDeclaredField = userClass.getDeclaredField("email");
            System.out.println(emailDeclaredField);

            System.out.println("Вывод полей getDeclaredFields()"); //getDeclaredFields используем для всех полей
            Field[] declaredFields = userClass.getDeclaredFields();
            for (Field field : declaredFields) {
                System.out.println(field);
            }

        } catch (NoSuchFieldException | SecurityException |
                 IllegalArgumentException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    private String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
