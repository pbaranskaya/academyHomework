package by.academy.homework3;

import java.util.regex.Pattern;

public class EmailValidator implements Validator {

    public static final Pattern p = Pattern.compile("\\w+@(gmail.com|mail.ru)");

    @Override
    public Pattern getPattern() {
        return p;
    }

    public static void main(String[] args) {

        Validator v = new EmailValidator();
        System.out.println(v.validate("pbaranskaya@gmail.com"));
    }
}
