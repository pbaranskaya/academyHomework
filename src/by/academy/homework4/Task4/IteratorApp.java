package by.academy.homework4.Task4;

public class IteratorApp {
    public static void main(String[] args) {

        Integer[] array = {1, 6, 7, 4, 2};

        MyIterator<Integer> myIterator = new MyIterator<>(array);

        while (myIterator.hasNext()) {
            System.out.print(myIterator.next() + " ");
        }
    }
}

