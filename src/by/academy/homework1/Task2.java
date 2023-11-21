package by.academy.homework1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.print("Тип данных = ");
        Scanner sc = new Scanner(System.in);
        String tip = sc.next();

        switch (tip) {
            case "int":
                System.out.print("Переменная = ");
                int a = sc.nextInt();
                System.out.println("Результат = " + (a % 2));
                break;
            case "double":
                System.out.print("Переменная = ");
                double b = sc.nextDouble();
                System.out.println("Результат = " + (b * 70 / 100));
                break;
            case "float":
                System.out.print("Переменная = ");
                float c = sc.nextFloat();
                System.out.println("Результат = " + (c * c));
                break;
            case "char":
                System.out.print("Переменная = ");
                char d = sc.next().charAt(0);
                System.out.print("Результат = " + d);
                break;
            case "String":
                System.out.print("Переменная = ");
                String e = sc.next();
                System.out.println("Результат = Hello " + e);
                break;
            default:
                System.out.println("Unsupported type");
        }
        sc.close();
    }
}
