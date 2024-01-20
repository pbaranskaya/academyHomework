package by.academy.homework5;

import java.util.*;

public class Task2 {

    private static final int N_ADD = 1000000;
    private static final int N_GET = 100000;

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        add(arrayList);
        get(arrayList);
        System.out.println("Затраченное время: " + (System.currentTimeMillis() - startTime) + " мс");

        long startTime1 = System.currentTimeMillis();
        add(linkedList);
        get(linkedList);
        System.out.println("Затраченное время: " + (System.currentTimeMillis() - startTime1) + " мс");
    }

    private static void add(List<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < N_ADD; i++) {
            list.add(rand.nextInt());
        }
    }

    private static void get(List<Integer> list) {
        for (int i = 0; i < N_GET; i++) {
            list.get((int) (Math.random() * (N_ADD - 1)));
        }
    }
}
