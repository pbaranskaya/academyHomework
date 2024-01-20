package by.academy.homework5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {

        String str = "Тигр, Тигр, жгучий страх, ты горишь в ночных лесах. " +
                     "Чей бессмертный взор, любя, создал страшного тебя?";
        String lowerstr = str.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < lowerstr.length(); i++) {
            Character uniqueChars = lowerstr.charAt(i);
            Integer counter = map.get(uniqueChars);
            if (counter == null) {
                counter = 1;
                map.put(uniqueChars, counter);
            } else {
                counter += 1;
                map.put(uniqueChars, counter);
            }
        }
        System.out.println("Частотный словарь: " + map.toString());
    }
}
