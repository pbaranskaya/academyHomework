package by.academy.homework5.Task3;

import by.academy.homework4.Task4.MyIterator;

import java.util.Arrays;

public class MyIteratorApp {
    public static void main(String[] args) {

        Integer[][] array = new Integer[][]{{5,7,3,17}, {7,0,1,12}};
        MyIterator<Integer[]> myIterator = new MyIterator<>(array);

        while (myIterator.hasNext()) {
            System.out.println(Arrays.toString(myIterator.next()));
        }
    }
}
