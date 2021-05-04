package com.raghav.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppleFunction {
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

    public AppleFunction(String name, int weight, String color, char grade) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.grade = grade;
    }

//List<Apple> createAppleList() {
//    return Arrays.asList(new Apple("Fuji", 250, "Green", 'c')
//            , new Apple("Pink", 200, "Red", 'c')
//            , new Apple("Gala", 250, "Green", 'c')
//            , new Apple("Pink", 250, "Red", 'c')
//            , new Apple("Pink", 180, "Red", 'c')
//    );
//}



    public static void main(String[] args) {

        Function<AppleFunction, AppleFunction> evaluateGrade = a-> {
            if(a.getColor().equals("Red") && a.weight>=200)
                a.setGrade('A');
            if(a.getColor().equals("Green") && a.weight>=200)
                a.setGrade('B');
            if(a.weight < 200)
                a.setGrade('C');

            return a;
        };

        List<AppleFunction> appleList = new ArrayList<>();
        appleList.add(new AppleFunction("Fuji", 250, "Green", 'c'));
        appleList.add(new AppleFunction("Pink", 200, "Red", 'c'));
        appleList.add(new AppleFunction("Gala", 250, "Green", 'c'));
        appleList.add(new AppleFunction("Pink", 250, "Red", 'c'));
        appleList.add(new AppleFunction("Pink", 180, "Red", 'c'));

        List<AppleFunction> collect = appleList.stream().map(a ->evaluateGrade.apply(a) ).collect(Collectors.toList());

        System.out.println(collect);

    }
}