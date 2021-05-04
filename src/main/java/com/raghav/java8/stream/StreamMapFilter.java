package com.raghav.java8.stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMapFilter {
    public static void main(String[] args) {
        List<String> s1 = new ArrayList<>();

       s1.add("raghav");
       s1.add("aarav");
       s1.add("shalini");
       s1.add("shalin");
       s1.add("Raghavendra");

        Comparator<String> comp = (i1, i2)->i1.compareTo(i2 );

        List<String> s2 =  s1.stream().sorted(comp).collect(Collectors.toList());
        List<String> s3 =  s1.stream().filter(sLength->sLength.length()>5).collect(Collectors.toList());
        List<String> sixLetterWords =  s1.stream().filter(v->v.length()>5)
                                        .filter((v->v.length()<7)).collect(Collectors.toList());
        Optional<String> first = s1.stream().filter(f -> f.length() > 5).findFirst();




        System.out.println( s2);
        System.out.println( s3);
        System.out.println(first);
        System.out.println(sixLetterWords);

    }
}
