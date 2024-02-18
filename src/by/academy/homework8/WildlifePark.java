package by.academy.homework8;

import by.academy.homework8.Birds.Bird;
import by.academy.homework8.Mammals.Mammal;
import by.academy.homework8.Reptiles.Reptile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static by.academy.homework8.TypeOfFood.GRASS;
import static by.academy.homework8.TypeOfFood.MEAT;

public class WildlifePark {

    private final List<Animal> animals = new ArrayList<>();
    private int capacity;

    public WildlifePark(int capacity) {
        super();
        this.capacity = capacity;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public int calculateFoodConsumtion(TypeOfFood typeOfFood) {
        if (animals == null) {
            return 0;
        }
        int result = 0;
        if (typeOfFood == GRASS) {
            List<Animal> newAnimals = animals.stream().filter(s -> s.getTypeOfFood() == GRASS).toList();
            result = newAnimals.stream().mapToInt(Animal::getAmountOfFoodPerDay).sum();
        }
        if (typeOfFood == MEAT) {
            List<Animal> newAnimals = animals.stream().filter(s -> s.getTypeOfFood() == MEAT).toList();
            result = newAnimals.stream().mapToInt(Animal::getAmountOfFoodPerDay).sum();
        }
        return result;
    }

    public int calculateAnimalsByTypeOfFood(TypeOfFood typeOfFood) {
        if (animals == null) {
            return 0;
        }
        int result = 0;
        if (typeOfFood == GRASS) {
            List<Animal> newAnimals = animals.stream().filter(s -> s.getTypeOfFood() == GRASS).toList();
            result = newAnimals.size();
        }
        if (typeOfFood == MEAT) {
            List<Animal> newAnimals = animals.stream().filter(s -> s.getTypeOfFood() == MEAT).toList();
            result = newAnimals.size();
        }
        return result;
    }

    public void calculateAnimalsByTypeOfAnimal() {
        if (animals == null) {
            return;
        }

        int result = 0;

        List<Animal> birdAnimals = animals.stream().filter(s -> s instanceof Bird).toList();
        result = birdAnimals.size();
        System.out.println("Количество животных типа Bird: " + result);

        List<Animal> mammalAnimals = animals.stream().filter(s -> s instanceof Mammal).toList();
        result = mammalAnimals.size();
        System.out.println("Количество млекопитающих типа Mammal: " + result);

        List<Animal> retileAnimals = animals.stream().filter(s -> s instanceof Reptile).toList();
        result = retileAnimals.size();
        System.out.println("Количество животных типа Reptile: " + result);
    }

    public void sleep() {
        animals.forEach(element -> System.out.println(element.getName() + " спит"));
    }

    public void sortByWeight() {
        List<Animal> newAnimals = animals.stream().sorted(Comparator.comparingInt(Animal::getWeight))
                .collect(Collectors.toList());

        Collections.reverse(newAnimals);
        System.out.println("Сортировка по весу:");
        newAnimals.forEach(element -> System.out.println(element.getName() + " = " + element.getWeight()));
    }

    public void sortByClass(){
        List<Animal> newAnimals = new ArrayList<>();

        List<Animal> mammalAnimals = animals.stream().filter(s -> s instanceof Mammal).toList();
        List<Animal> birdAnimals = animals.stream().filter(s -> s instanceof Bird).toList();
        List<Animal> reptileAnimals = animals.stream().filter(s -> s instanceof Reptile).toList();

        newAnimals.addAll(mammalAnimals);
        newAnimals.addAll(birdAnimals);
        newAnimals.addAll(reptileAnimals);

        System.out.println("Сортировка по классу (млекопитающие, птицы, рептилии): ");
        newAnimals.forEach(element -> System.out.println(element.getName()));
    }

    public List<Animal> findAnimalsByFoodTypeAndConsumption(TypeOfFood typeOfFood, int minAmountOfFood, int maxAmountOfFood){
        List<Animal> newAnimals = new ArrayList<>();
        if (typeOfFood == GRASS) {
            newAnimals = animals.stream().filter(s -> s.getTypeOfFood() == GRASS)
                    .filter(s -> s.getAmountOfFoodPerDay() >= minAmountOfFood
                    && s.getAmountOfFoodPerDay() <= maxAmountOfFood).collect(Collectors.toList());
        }
        if (typeOfFood == MEAT) {
            newAnimals = animals.stream().filter(s -> s.getTypeOfFood() == MEAT).
                    filter(s -> s.getAmountOfFoodPerDay() >= minAmountOfFood
                    && s.getAmountOfFoodPerDay() <= maxAmountOfFood).collect(Collectors.toList());

        }
        return newAnimals;
    }

    public int calculateWeight() {
        if (animals == null) {
            return 0;
        }
        return animals.stream().mapToInt(Animal::getWeight).sum();
//        return animals.stream().mapToInt(s -> s.getWeight()).sum();
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "WildlifePark{" +
                "animals=" + animals +
                '}';
    }
}
