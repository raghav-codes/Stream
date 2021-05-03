package com.raghav.java8.stream;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNos {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();

        for(int i=0;i < 10; i++){
            l1.add(i);
        }

        System.out.println(l1);

        List<Integer> l2 = new ArrayList<>();

        for(Integer i:l1){
            if(i%2==0)
                l2.add(i);
        }

        System.out.println(l2);

        List<Integer> l3 = l1.stream().filter(j -> j % 2 == 0).collect(Collectors.toList());

        System.out.println(l3);

        long count = l1.stream().filter(j -> j % 2 == 0).count();

        System.out.println("Count of even nos : "+count);

        Comparator<Integer> comp = (i1,i2)->i2.compareTo(i1);

        List<Integer> l4 = l1.stream().sorted(comp).collect(Collectors.toList());
        System.out.println(l4);

        Integer max = l1.stream().max(comp).get();
        Integer min = l1.stream().min(comp).get();

        System.out.println("min :" + min);
        System.out.println("max :" + max);

        l1.stream().forEach(i-> System.out.println(i));



    }

}
