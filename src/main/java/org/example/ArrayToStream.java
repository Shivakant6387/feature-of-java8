package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
    public static void main(String[] args) {
        // Converting String array to stream
        String[] arr = { "Geeks", "for", "Geeks" };

        // Using Arrays.stream to convert an
        // array into Stream
        Stream<String> stm = Arrays.stream(arr);

        // Displaying elements in Stream
        stm.forEach(str -> System.out.print(str + " "));
    }
}
