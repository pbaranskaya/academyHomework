package by.academy.homework4.Task3;

import java.util.Scanner;

public class ArrayApp {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Array<Integer> array = new Array<Integer>(4);

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

        System.out.println(array);
        System.out.print("Элемент массива по индексу: ");
        int a = sc.nextInt();
        array.getElement(a);

        System.out.println("Первый элемент массива: " + array.getFirstElement());

        System.out.println("Последний элемент массива: " + array.getLastElement());

        System.out.println("Размер массива: " + array.arraySize());

        System.out.println("Индекс последнего элемента: " + array.indexOfLastElement());

        System.out.print("Удалить элемент по индексу: ");
        int b = sc.nextInt();
        array.removeElement_i(b);
        System.out.println(array);

        System.out.print("Удалить элемент, задав число: ");
        int c = sc.nextInt();
        array.removeElement_obj(c);
        System.out.println(array);

        sc.close();
    }
}
