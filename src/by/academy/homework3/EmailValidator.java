package by.academy.homework3;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {

    public static final Pattern p = Pattern.compile("\\w+@(gmail.com|mail.ru)");

    @Override
    public Pattern getPattern() {
        return p;
    }

}
