package by.academy.homework5;

import java.util.ArrayList;
import java.util.ListIterator;

public class Task4 { //
    public static void main(String[] args) {

        int listSize = 10;

        ArrayList<Integer> marks = new ArrayList<>();

        for (int i = 0; i < listSize; i++) {
            int a = (int) (Math.random() * 10 + 1);
            marks.add(i, a);
        }

        System.out.print("Оценки: " + marks + " ");
        System.out.println();

        ListIterator<Integer> listIterator = marks.listIterator();
        while (listIterator.hasNext()) {
            int max = 0;
            for (Integer el : marks) {
                el = listIterator.next();
                if (el > max) {
                    max = el;
                }
            }
            System.out.println("Максимальная оценка: " + max);
        }
    }
}

