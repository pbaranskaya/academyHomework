package by.academy.homework5;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> list = List.of("a", "b", "b", "c");
        System.out.println("Коллекция: " + list);
        System.out.println("Коллекция без дубликатов: " + removeDuplicates(list));

    }

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }

}