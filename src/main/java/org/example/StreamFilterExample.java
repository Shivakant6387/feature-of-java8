package org.example;

import java.util.stream.Stream;

public class StreamFilterExample {
    public static void main(String[] args) {
        // create a stream of strings
        Stream<String> myStream
                = Stream.of("Like", "and", "Share",
                "https://www.geeksforgeeks.org/");

        // only string starting with "http://" will be
        // considered for next API(forEach)
        myStream.filter(x -> x.startsWith("https://"))
                .forEach(System.out::println);
    }
}
