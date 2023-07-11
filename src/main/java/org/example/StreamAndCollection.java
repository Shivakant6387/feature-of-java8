package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamAndCollection {
    // Main driver method
    public static void main(String[] args)
    {
        // Creating an instance of list
        List<String> CompanyList = new ArrayList<>();

        // Adding elements using add() method
        CompanyList.add("Google");
        CompanyList.add("Apple");
        CompanyList.add("Microsoft");

        // Now creating a comparator
        Comparator<String> com
                = (String o1, String o2) -> o1.compareTo(o2);

        // Sorting the list
        Collections.sort(CompanyList, com);

        // Iterating using for each loop
        for (String name : CompanyList) {

            // Printing the elements
            System.out.println(name);
        }
    }

}
