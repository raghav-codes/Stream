package com.raghav.java8.functiontest;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {

        Function<String,Integer> len = s->s.length();
        System.out.println(len.apply("Raghav"));
        System.out.println(len.apply("Aarav"));

    }
}
