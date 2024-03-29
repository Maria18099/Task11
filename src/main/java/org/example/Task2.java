package org.example;

import java.util.Comparator;
import java.util.List;

//Метод приймає на вхід список рядків (можна взяти список із Завдання 1).
//Повертає список цих рядків у верхньому регістрі, і відсортованих за спаданням (від Z до A).
public class Task2 {
    public static List<String> task(List<String> words){
        return words.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}
