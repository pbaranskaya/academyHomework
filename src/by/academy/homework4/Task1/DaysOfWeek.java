package by.academy.homework4.Task1;

public enum DaysOfWeek {

    MONDAY("Понедельник"), TUESDAY("Вторник"),
    WEDNESDAY("Среда"), THURSDAY("Четверг"),
    FRIDAY("Пятница"), SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    public final String name;

    DaysOfWeek(String name) {
        this.name = name;
    }
}

