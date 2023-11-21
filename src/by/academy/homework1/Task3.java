package by.academy.homework1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.print("Число = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Таблица умножения для числа " + a + " = ");
        for (int i = 1; i <= 10; i++) {
            int res = a * i;
            System.out.print(res + " ");
        }
    }
}
