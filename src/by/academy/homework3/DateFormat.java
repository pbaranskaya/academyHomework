package by.academy.homework3;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormat {

    public static boolean dateFormat (String date) {
        Pattern pattern = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    public static boolean dateFormat1 (String date) {
        Pattern pattern = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Дата рождения: ");
        String date = sc.nextLine();
//        LocalDate dateOfBirth = LocalDate.parse(date);

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Месяц: MMMM, день: dd, год: yyyy", Locale.US);
//        System.out.println(dateOfBirth);
//
//        System.out.println(dateOfBirth.format(formatter));



//        System.out.println(dateFormat(date) ? "Формат 1" :
//                           dateFormat1(date) ? "Формат 2" : "Неверный формат даты");


        if (dateFormat(date)) {
            LocalDate dateOfBirth = LocalDate.parse(date);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern
                    ("Месяц: MMMM, день: dd, год: yyyy", Locale.US);
            System.out.println(dateOfBirth.format(formatter));
        } else if (dateFormat1(date)) {
            LocalDate dateOfBirth = LocalDate.parse(date);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern
                    ("Месяц: MMMM, день: dd, год: yyyy", Locale.US);
            System.out.println(dateOfBirth.format(formatter));
        }

    }
}



