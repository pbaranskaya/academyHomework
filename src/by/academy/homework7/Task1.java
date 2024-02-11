package by.academy.homework7;

//Не использовать циклы (for/while/do-while). Сгенерировать 100 рандомных Long чисел в диапазоне от 0 до 100.
//Каждое число умножить на PI и отнять 20. Отфильтровать, оставив числа меньшие 100. Отсортировать по возрастанию.
//Пропустив первые 3 числа произвести следующие операции:
//Преобразовать лист чисел в Map (операция collect), где ключем является само число а значением строка:
//("Number: " + value).

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Task1 {
    public static void main(String[] args) {

        Random rand = new Random();

        List<Long> list = LongStream.generate(() -> rand.nextLong(101)).limit(100).boxed()
                .map(i -> (long) (i * Math.PI - 20)).filter(i -> i < 100).sorted().skip(3)
                .collect(Collectors.toList());

        Map<Long, String> map = list.stream().collect(Collectors.toMap
                (i -> i, j -> ("Number: " + j), (oldvalue, newvalue) -> oldvalue));

        System.out.println(map);
    }
}
