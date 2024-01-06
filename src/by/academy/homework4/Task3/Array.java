package by.academy.homework4.Task3;

import java.util.Arrays;

public class Array<T> {
    private T[] array;
    private int current;

    public Array() {
        super();
        this.array = (T[]) new Object[16];
    }

    public Array(int size) {
        this.array = (T[]) new Object[size];
    }

    public void add(T element) {
        if (array == null) {
            this.array = (T[]) new Object[10];
        }
        if (array.length <= current) {
            grow();
        }
        array[current++] = element;
    }

    public void grow() {
        T[] temp = (T[]) new Object[array.length * 2 + 1];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }

    public void getElement(int i) {
        if (i >= this.current || i < 0) {
            System.out.println("Элемента с таким индексом не существует.");
        } else {
            System.out.println(array[i]);
        }
    }

    public T getLastElement() {
        return (T) array[current - 1];
    }

    public T getFirstElement() {
        return (T) array[0];
    }

    public int arraySize() {
        return array.length;
    }

    public int indexOfLastElement() {
        return current - 1;
    }
    public void removeElement_i(int i) {
        if (i >= this.current || i < 0) {
            System.out.println("Удаление невозможно");
            return;
        }
        if (i != array.length - 1) {
            System.arraycopy(array, i + 1, array, i, array.length - i - 1);
        }
        array[--current] = null;
    }

    public void removeElement_obj(T obj) {
        for (int i = 0; i < this.current; i++) {
            if (array[i] == obj) {
                System.arraycopy(array, i + 1, array, i, array.length - i - 1);
                array[--current] = null;
                return;
            }
        }
        System.out.println("Такого числа нет в массиве");
    }

    @Override
    public String toString() {
        return "Array{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
