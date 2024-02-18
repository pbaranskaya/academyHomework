package by.academy.homework8;

public enum TypeOfFood {

    MEAT("Мясо"), GRASS("Трава");

    public final String name;

    TypeOfFood(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TypeOfFood{" +
                "name='" + name + '\'' +
                '}';
    }
}
