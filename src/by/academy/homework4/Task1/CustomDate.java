package by.academy.homework4.Task1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CustomDate {

    public Year year;
    public Month month;
    public Day day;
    static DaysOfWeek dayOfWeek;

    public CustomDate(int year, int month, int day) {
        super();
        this.year = this.new Year(year);
        this.month = this.new Month(month);
        this.day = this.new Day(day);
        this.enumDayOfWeek();
    }

    public CustomDate(String strDate) {
        super();
        this.year = new Year(Integer.parseInt(strDate.substring(6)));
        this.month = new Month(Integer.parseInt(strDate.substring(3, 5)));
        this.day = new Day(Integer.parseInt(strDate.substring(0, 2)));
        this.enumDayOfWeek();
    }

    public LocalDate toLocalDate() {
        return LocalDate.of(this.year.value, this.month.value, this.day.value);
    }

    public void printDayOfWeek() {
        System.out.println("День недели (номер): " + this.toLocalDate().getDayOfWeek().getValue());
    }

    public class Year {
        int value;

        public Year(int year) {
            this.value = year;
        }
    }

    public class Month {
        int value;

        public Month(int month) {
            this.value = month;
        }
    }

    public class Day {
        int value;

        public Day(int day) {
            this.value = day;
        }
    }

    public void enumDayOfWeek() {
        switch (this.toLocalDate().getDayOfWeek().toString()) {
            case "MONDAY":
                dayOfWeek = DaysOfWeek.MONDAY;
                break;
            case "TUESDAY":
                dayOfWeek = DaysOfWeek.TUESDAY;
                break;
            case "WEDNESDAY":
                dayOfWeek = DaysOfWeek.WEDNESDAY;
                break;
            case "THURSDAY":
                dayOfWeek = DaysOfWeek.THURSDAY;
                break;
            case "FRIDAY":
                dayOfWeek = DaysOfWeek.FRIDAY;
                break;
            case "SATURDAY":
                dayOfWeek = DaysOfWeek.SATURDAY;
                break;
            case "SUNDAY":
                dayOfWeek = DaysOfWeek.SUNDAY;
                break;
        }
    }

    public void printCustomDayOfWeek() {
        System.out.println("День недели (название): " + dayOfWeek.name);
    }

    static void calculateDays(CustomDate startDate, CustomDate endDate) {
        LocalDateTime date1 = startDate.toLocalDate().atStartOfDay();
        LocalDateTime date2 = endDate.toLocalDate().atStartOfDay();
        long daysBetween = Duration.between(date1, date2).toDays();
        System.out.println("Количество дней между датами: " + daysBetween);
    }

    public static boolean isleapYear(CustomDate customDate) {
        LocalDate date = customDate.toLocalDate();
        return date.isLeapYear();
    }

    public Year getYear() {
        return year;
    }

    public Month getMonth() {
        return month;
    }

    public Day getDay() {
        return day;
    }
}
