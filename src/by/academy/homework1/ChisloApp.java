package by.academy.homework1;
import java.util.Scanner;

public class ChisloApp {
    public static void main(String[] args) {

        System.out.print("Число = ");
        Chislo chislo = new Chislo();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        chislo.setZnachenie(a);
        int chisloZnachenie = chislo.getZnachenie();
        chislo.tablitsa();
        sc.close();
    }
}
