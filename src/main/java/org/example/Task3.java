package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Є масив:
//["1, 2, 0", "4, 5"]
//Необхідно отримати з масиву всі числа, і вивести їх у відсортованому вигляді через кому,
// наприклад:
//
//"0, 1, 2, 4, 5"
public class Task3 {
    public static void task() {
        List<String> sortedNumbers = Stream.of("1, 2, 0", "4, 5")
                .flatMap(s -> Arrays.stream(s.split(",\\s")))
                .sorted()
                .toList();
        System.out.println(sortedNumbers);
    }
}
