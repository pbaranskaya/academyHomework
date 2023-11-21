package by.academy.homework1;

public class Task4 {
    public static void main(String[] args) {

        int a = 2;
        int i = 0;
        while (a <= 1_000_000) {
            a = a * 2;
            if (a <= 1_000_000) {
                System.out.print(a + " ");
            }
            i++;
        }
        System.out.println();
        System.out.println(i + " раз число возвели в степень");
    }
}




