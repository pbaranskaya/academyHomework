package by.academy.homework1;

// Второй вариант Task3

public class Chislo {

    int znachenie;

    public Chislo() {
        super();
    }

    public void setZnachenie(int znachenie) {
        this.znachenie = znachenie;
    }

    public int getZnachenie() {
        return znachenie;
    }

    public void tablitsa() {
        System.out.print("Таблица умножения для числа " + znachenie + " = ");
        for (int i = 1; i <= 10; i++) {
            int res = znachenie * i;
            System.out.print(res + " ");
        }
    }
}
