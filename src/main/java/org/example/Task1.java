package org.example;
//Метод приймає на вхід список імен. Необхідно повернути рядок вигляду
// 1. Ivan, 3. Peter... лише з тими іменами, що стоять під непарним індексом (1, 3 тощо)
import java.util.List;

public class Task1 {
    public static void task(List<String> names){
        List<String> list = names.stream()
                .filter(name -> names.indexOf(name) % 2 == 0)
                .map(name -> (names.indexOf(name) + 1) + ". " + name)
                .toList();
        System.out.println(list);
    }
}
