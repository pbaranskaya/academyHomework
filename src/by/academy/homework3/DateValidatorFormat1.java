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
}
