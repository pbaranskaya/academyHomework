package by.academy.homework2;
import java.util.Scanner;

public class Task1 {

    public static boolean anagram (String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        int[] symbols = new int[256];

        char[] a_array = a.toCharArray();
        for (char a_elements : a_array) {
            symbols[a_elements]++;
        }

        for (int i = 0; i < b.length(); i++) {
            int b_elements = (int) b.charAt(i);
            symbols[b_elements]--;
            if (symbols[b_elements] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Слово 1: ");
        String a = sc.next();
        System.out.print("Слово 2: ");
        String b = sc.next();
        System.out.println(anagram(a,b) ? "Слова являются анаграммой" : "Слова не являются анаграммой");
        sc.close();
    }
}
