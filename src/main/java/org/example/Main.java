package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Task 1
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Sam");
        names.add("Maria");
        names.add("Ron");
        names.add("Sergiy");
        Task1.task(names);

        //Task 2
        System.out.println(Task2.task(names));

        //Task 3
        Task3.task();

        //Task 4
        Stream<Long> task4 = Task4.task(25214903917L, 11, 2 ^ 48);
        System.out.println(task4.limit(10).toList());

        //Task 5
        Stream<Integer> stream1 = Stream.of(1, 3, 5, 7, 9);
        Stream<Integer> stream2 = Stream.of(2, 4, 6);
        Stream<Integer> zippedStream = Task5.zip(stream1, stream2);
        zippedStream.forEach(System.out::println);
    }
}