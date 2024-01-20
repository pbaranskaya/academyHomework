package by.academy.homework5;

public class Task6 {
    public static void main(String[] args) {

        int[] array = new int[8];

        try {
            array[9] = 2;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception " + e);
        }
        System.err.println("Array is to small, expand the array");
    }
}
