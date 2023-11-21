package by.academy.homework1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        double cena = 0;

        System.out.print("Сумма покупки без скидки = ");
        Scanner sc = new Scanner(System.in);
        double sum = sc.nextDouble();
        System.out.print("Возраст покупателя = ");
        int age = sc.nextInt();

        if (sum < 100) {
            cena = sum - (sum * 5 / 100);
        } else if (100 <= sum && sum < 200) {
            cena = sum - (sum * 7 / 100);
        } else if (200 <= sum && sum < 300) {
            cena = sum - (sum * 12 / 100);
            cena = age > 18 ? cena - (sum * 4 / 100) :  cena + (sum * 3 / 100);
        } else if (300 <= sum && sum < 400) {
            cena = sum - (sum * 15 / 100);
        } else {
            cena = sum - (sum * 20 / 100);
        }
        System.out.println("Сумма покупки со скидкой = " + cena);
        sc.close();
    }
}
