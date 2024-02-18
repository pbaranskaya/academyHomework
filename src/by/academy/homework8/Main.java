package by.academy.homework8;

// ост 4

// +? Добавить метод, который заставит всех животных уснуть - используем stream/lambda
//
// +? По виду: (используем instance of)
//    Сортировка по видам животных (млекопитающие, птицы, рептилии).
//
// + Поиск:
//   Поиск животного в зоопарке, соответствующего заданному типу пищи и диапазону параметров потребления пищи:
//   Например, findAnimalsByFoodTypeAndConsumption(FoodType, From, To) - findAnimalsByFoodTypeAndConsumption(Meat, 5, 10) -
//   значит найти всех животных, которые едят мясо от 5 до 10 кг в день
//   Использовать стримы/лямбды

import by.academy.homework8.Birds.Bird;
import by.academy.homework8.Birds.HerbivorousBird;
import by.academy.homework8.Mammals.HerbivorousMammal;
import by.academy.homework8.Mammals.Mammal;
import by.academy.homework8.Reptiles.Reptile;
import by.academy.homework8.Reptiles.Snake;
import by.academy.homework8.Reptiles.Turtle;

import static by.academy.homework8.TypeOfFood.GRASS;
import static by.academy.homework8.TypeOfFood.MEAT;

public class Main {
    public static void main(String[] args) {

        WildlifePark wl = new WildlifePark(30);

        Bird bird1 = new HerbivorousBird("Сокол", 2, 2, MEAT);
        Mammal mammal1 = new HerbivorousMammal("Корова", 80,5, GRASS);
        Reptile reptile1 = new Turtle("Черепаха", 30, 1, GRASS);
        Reptile reptile2 = new Snake("Змея", 10, 6, MEAT);

        wl.addAnimal(bird1);
        wl.addAnimal(mammal1);
        wl.addAnimal(reptile1);
        wl.addAnimal(reptile2);

        System.out.println("Добро пожаловать в зоопарк!");
        System.out.println("Зоопарк вмещает " + wl.getCapacity() + " людей");
        System.out.println("Животные зоопарка: ");
        System.out.println(wl);
        System.out.println("Вес всех животных в зоопарке: " + wl.calculateWeight());

        System.out.println("Количество потребления пищи травоядных животных: " + wl.calculateFoodConsumtion(GRASS));
        System.out.println("Количество потребления пищи хищных животных: " + wl.calculateFoodConsumtion(MEAT));

        System.out.println("Количество травоядных животных: " + wl.calculateAnimalsByTypeOfFood(GRASS));
        System.out.println("Количество хищных животных: " + wl.calculateAnimalsByTypeOfFood(MEAT));

        wl.calculateAnimalsByTypeOfAnimal();
        wl.sleep();

        System.out.println("===========");
        wl.sortByWeight();
        System.out.println("===========");
        wl.sortByClass();
        System.out.println("===========");
        System.out.println("Найти животное по типу и количеству потребляемой пищи: ");
        System.out.println(wl.findAnimalsByFoodTypeAndConsumption(MEAT,1,4));
    }
}
