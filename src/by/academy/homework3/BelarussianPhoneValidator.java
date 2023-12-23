package by.academy.homework3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BelarussianPhoneValidator implements Validator {

    public static final Pattern p = Pattern.compile("\\+375(29|33|25)\\d{7}");

    @Override
    public Pattern getPattern() {
        return p;
    }
}
