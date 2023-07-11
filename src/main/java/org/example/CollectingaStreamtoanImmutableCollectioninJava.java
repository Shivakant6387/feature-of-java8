package org.example;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingaStreamtoanImmutableCollectioninJava {
    public static void main(String[] args) {
        // Custom inputs integer elements in List
        var unmodifiableList
                = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        Collections::unmodifiableList));

        System.out.println(unmodifiableList);

        // Operations like this will result in an exception
        unmodifiableList.add(12);
    }
}
