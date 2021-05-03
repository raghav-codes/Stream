package com.raghav.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLower {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        
        l1.add("RaghaV");
        l1.add("AaraV");
        l1.add("ShaliNI");

        List<String> l2 = l1.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());

        System.out.println(l2);


    }
}
