package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(4);
        arrayList.add(20);
        // First lets print the collection
        System.out.println("Printing the collection : "
                + arrayList);

        // Printing new line for better output readability
        System.out.println();
        List<Integer> ls
                = arrayList.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        // Print the collection after stream operation
        // as stored in List object
        System.out.println(
                "Printing the List after stream operation : "
                        + ls);
    }
}
