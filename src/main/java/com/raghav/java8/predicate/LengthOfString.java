package com.raghav.java8.predicate;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Predicate;

public class LengthOfString {

    public static void main(String args[]){

        Predicate<String> p = s->(s.length()>5);
        System.out.println(p.test("Raghav"));
        System.out.println(p.test("Ragha"));
        System.out.println(p.test("Ragh"));
    }


}
