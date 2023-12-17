package by.academy.homework3;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

    public static final Pattern p = Pattern.compile("\\+1\\d{10}");

    @Override
    public Pattern getPattern() {
        return p;
    }

    public static void main(String[] args) {
        Validator v = new AmericanPhoneValidator();
        System.out.println(v.validate("+19873456354"));
    }

}
