package by.academy.homework3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DateValidatorFormat2 implements Validator {

    public static final Pattern p = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

    @Override
    public Pattern getPattern() {
        return p;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Validator v = new DateValidatorFormat2();
        System.out.print("Дата: ");
        System.out.println(v.validate(sc.nextLine()));
    }
}
