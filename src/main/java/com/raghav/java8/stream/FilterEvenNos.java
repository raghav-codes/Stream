package com.raghav.java8.stream;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNos {

    static class Apple {
        String name;
        int weight;
        String color;
        char grade;

        @Override
        public String toString() {
            return "Apple{" +
                    "name='" + name + '\'' +
                    ", weight=" + weight +
                    ", color='" + color + '\'' +
                    ", grade=" + grade +
                    '}';
        }

        public Apple(String name, int weight, String color, char grade) {
            this.name = name;
            this.weight = weight;
            this.color = color;
            this.grade = grade;
        }

        public Apple(String name, int weight, String color) {
            this.name = name;
            this.weight = weight;
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public char getGrade() {
            return grade;
        }

        public void setGrade(char grade) {
            this.grade = grade;
        }

        

    }

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


        appleCheck();



    }
    
    public static void appleCheck(){
        
        List<Apple> apple = new ArrayList<>();
        apple.add(new Apple("Fuji",250,"Green"));
        apple.add(new Apple("Pink",200,"Red"));
        apple.add(new Apple("Fuji",240,"Red"));
        apple.add(new Apple("Fuji",250,"Green"));
        apple.add(new Apple("Fuji", 150, "Green"));

        List<Apple> collect = apple.stream().filter(a -> a.weight >= 200)
                .filter(a -> (a.color).equals("Green")).collect(Collectors.toList())
                .stream().map(v -> new Apple(v.getName(),v.getWeight(),v.getColor(),'A')).collect(Collectors.toList());

       System.out.println(collect);
    }

}
