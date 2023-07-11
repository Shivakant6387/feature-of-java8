package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodUsingStream {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Sakshi Mishra");
        list.add("Sk Singh");
        list.add("Antima");
        list.add("Amrita");
        System.out.println(list);
        List ls=list.stream().map(s->s.length()).collect(Collectors.toList());
        System.out.println("Map"+ls);
    }
}
