package by.academy.homework3;

import java.util.regex.Pattern; // как-то и на p1 проверить?

public class DateValidator implements Validator {

    public static final Pattern p = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
    public static final Pattern p1 = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

    @Override
    public Pattern getPattern() {
        return p;
    }
}
