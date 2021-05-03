package com.raghav.java8.predicate.join;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Predicate;

class PredicateJoin {
    public static void main(String[] args) {
        int [] x = {0,7,10,20,30,37,50,60,70};

        Predicate<Integer> p1 = i->i>20;
        Predicate<Integer> p2 = i->i%2==0;

        System.out.println("Greater than 20");
        m1(p1,x);

        System.out.println("Even Numbers");
        m1(p2,x);

        System.out.println("Not greater than 20 :");
        m1(p1.negate(),x);

        System.out.println("Greater than 20 and even ");
        m1(p1.and(p2),x);



    }

    static void m1(Predicate<Integer> p, int[] x){
        for(int eachValue:x){
            if(p.test(eachValue)){
                System.out.println(eachValue);
            }

        }
    }



}
