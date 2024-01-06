package by.academy.homework4.Task1;

public enum DaysOfWeek {

    MONDAY("Понедельник", 1), TUESDAY("Вторник", 2),
    WEDNESDAY("Среда", 3), THURSDAY("Четверг", 4),
    FRIDAY("Пятница", 5), SATURDAY("Суббота", 6),
    SUNDAY("Воскресенье", 7);

    public final String name;
    public final int daysNumber;

    DaysOfWeek(String name, int daysNumber) {
        this.name = name;
        this.daysNumber = daysNumber;
    }
}

