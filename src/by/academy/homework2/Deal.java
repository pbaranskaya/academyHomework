package by.academy.homework2;
import java.util.Scanner;
import java.util.Random;

public class Deal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cardsForPlayer = 5;

        String[] suits = {"Пик", "Бубен", "Треф", "Черв"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Валет", "Дама", "Король", "Туз"};

        int nCards = suits.length * ranks.length;

        System.out.print("Количество игроков: ");
        int players = sc.nextInt();

        if (cardsForPlayer * players > nCards) {
            System.out.println("Слишком много игроков");
            return;
        }

        if (players < 2) {
            System.out.println("Слишком мало игроков");
            return;
        }

        String[] cards = new String[nCards];
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                cards[suits.length * i + j] = ranks[i] + " " + suits[j];
            }
        }

        for (int i = 0; i < nCards; i++) {
            int oneCard = i + (int) (Math.random() * (nCards - i));
            String x = cards[oneCard];
            cards[oneCard] = cards[i];
            cards[i] = x;
        }

        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(cards[i]);
            if (i % cardsForPlayer == cardsForPlayer - 1) {
                System.out.println("========");
            }
        }
        sc.close();
    }
}
