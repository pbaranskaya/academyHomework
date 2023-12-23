package by.academy.homework3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DateValidatorFormat2 implements Validator {

    public static final Pattern p = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

    @Override
    public Pattern getPattern() {
        return p;
    }
}
