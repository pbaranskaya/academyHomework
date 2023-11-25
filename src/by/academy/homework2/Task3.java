package by.academy.homework2;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Слово 1, слово 2: ");

        String[] ab = sc.nextLine().split(" ");
        String a = ab[0];
        String b = ab[1];

        for (int i = 0; i < 2; i++) {
            if (a.length() % 2 != 0 || b.length() % 2 != 0) {
                System.out.println("Нечетное число символов в слове/ах");
                return;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(a.substring(0,a.length() / 2));
        sb.append(b.substring(b.length() / 2, b.length()));
        System.out.println("Полученное слово: " + sb);
        sc.close();
    }
}

