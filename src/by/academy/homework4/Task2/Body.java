package by.academy.homework4.Task2;

public class Body {

    public Heart heart;
    public Lungs lungs;

    public Body() {
        super();
        heart = new Heart();
        lungs = new Lungs();
    }

    public class Heart {
        public void live() {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                if ((i + 1) % 100 == 0) {
                    System.out.println("Knock-knock-knockin' on heaven's door. " + "Итерация " + (i + 1));
                }
            }
        }
    }

    public class Lungs {
        public void live() {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                if ((i + 1) % 50 == 0) {
                    System.out.println("Breathe in " + "Итерация " + (i + 1));
                }
                if ((i + 1) % 100 == 0) {
                    System.out.println("Breathe out " + "Итерация " + (i + 1));
                }
            }
        }
    }

    public void live() {
        heart.live();
        lungs.live();
        System.out.println("You stand on the shore and feel the salty smell of the wind that blows from the sea. " +
                "And I believe that you are free, and life has only begun.");
    }
}
