package by.academy.homework2;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Слово 1, слово 2: ");
//        String[] words = new String[2]; // вариант 1
//        for (int i = 0; i < 2; i++) {
//            words[i] = sc.next();
//        }
//        String str = words[0].substring(0, words[0].length() / 2) +
//                     words[1].substring(words[1].length() / 2, words[1].length());
//        System.out.println("Полученное слово: " + str);


        String word1 = sc.next(); // вариант 2
        String word2 = sc.next();
        word1 = word1.substring(0,word1.length() / 2);
        word2 = word2.substring(word2.length() / 2, word2.length());
        StringBuilder sb = new StringBuilder(word1 + word2);
        System.out.println("Полученное слово: " + sb);
        sc.close();
    }
}

