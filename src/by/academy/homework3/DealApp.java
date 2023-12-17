package by.academy.homework3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DealApp {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.of(2020, 1, 1, 10, 0, 0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Месяц: MMMM, день: dd, год: yyyy", Locale.US);
        System.out.println(dateTime);

        System.out.println(dateTime.format(formatter));


    }


}


