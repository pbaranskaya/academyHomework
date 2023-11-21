package by.academy.homework2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();

        sc.nextLine();

        System.out.println("Слова: ");
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        List<String> words1 = new ArrayList<>(Arrays.asList(words));
        words1.sort((first, second) -> Integer.compare(first.length(), second.length()));
        System.out.print("Самое короткое слово: ");
        System.out.println(words1.get(0));
        sc.close();
    }
}
