package org.example;
//Напишіть метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
//який "перемішує" елементи зі стрімів first та second, зупиняючись тоді,
//коли у одного зі стрімів закінчаться елементи.
import java.util.stream.Stream;

public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        var firstIterator = first.iterator();
        var secondIterator = second.iterator();
        Stream.Builder<T> builder = Stream.builder();
        while (firstIterator.hasNext() && secondIterator.hasNext()){
            builder.add(firstIterator.next());
            builder.add(secondIterator.next());
        }
        return builder.build();
    }
}
