package by.academy.homework4.Task1;

import by.academy.homework3.Validator;

import java.util.regex.Pattern;

public class DateValidator implements Validator {
    public static final Pattern p = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

    @Override
    public Pattern getPattern() {
        return p;
    }
}
