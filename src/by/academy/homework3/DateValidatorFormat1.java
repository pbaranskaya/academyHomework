package by.academy.homework3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DateValidatorFormat1 implements Validator {

    public static final Pattern p = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");

    @Override
    public Pattern getPattern() {
        return p;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Validator v = new DateValidatorFormat1();
        System.out.print("Дата: ");
        String date = sc.nextLine();
        System.out.println(v.validate(date));
        if (v.validate(date)) {
            LocalDate dateOfBirth = LocalDate.parse(date);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern
                    ("Месяц: MMMM, день: dd, год: yyyy", Locale.US);
            System.out.println(dateOfBirth.format(formatter));
        }
    }
}
