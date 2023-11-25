package by.academy.homework2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2 {

    public static int countSymbols(String str) {
        Set uniqueChars = new HashSet();
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            uniqueChars.add(str.charAt(i));
            counter = uniqueChars.size();
        }
        return counter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cлова: ");
        String[] words = sc.nextLine().split(" ");

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        int min = 999;

        for ( int i = 0, currentValue = 0; i < words.length; i++ ) {
            currentValue = countSymbols(words[i]);
            hashMap.put(words[i], currentValue);
            if (min > currentValue) {
                min = currentValue;
            }
        }

        for (HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue().equals(min)) {
                System.out.println("Слово с наименьшим количеством уникальных символов: " + entry.getKey());
            }
        }
        sc.close();
    }
}