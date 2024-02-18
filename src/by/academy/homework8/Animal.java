package by.academy.homework8;

public class Animal {

    private String name;
    private int weight;
    private int amountOfFoodPerDay;
    private TypeOfFood typeOfFood;

    public Animal(String name, int weight, int amountOfFoodPerDay, TypeOfFood typeOfFood){
        super();
        this.name = name;
        this.weight = weight;
        this.amountOfFoodPerDay = amountOfFoodPerDay;
        this.typeOfFood = typeOfFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAmountOfFoodPerDay() {
        return amountOfFoodPerDay;
    }

    public void setAmountOfFoodPerDay(int amountOfFoodPerDay) {
        this.amountOfFoodPerDay = amountOfFoodPerDay;
    }

    public TypeOfFood getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(TypeOfFood typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", amountOfFoodPerDay=" + amountOfFoodPerDay +
                ", typeOfFood=" + typeOfFood +
                '}';
    }
}
