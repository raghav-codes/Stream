package com.raghav.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppleStreamMap {
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

    public AppleStreamMap(String name, int weight, String color, char grade) {
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

        List<AppleStreamMap> appleList = new ArrayList<>();
        appleList.add(new AppleStreamMap("Fuji", 250, "Green", 'c'));
        appleList.add(new AppleStreamMap("Pink", 200, "Red", 'c'));
        appleList.add(new AppleStreamMap("Gala", 250, "Green", 'c'));
        appleList.add(new AppleStreamMap("Pink", 250, "Red", 'c'));
        appleList.add(new AppleStreamMap("Pink", 180, "Red", 'c'));

        List<AppleStreamMap> collect = appleList.stream().map(a ->{
            if(a.getColor().equals("Red") && a.weight>=200)
                a.setGrade('A');
            if(a.getColor().equals("Green") && a.weight>=200)
                a.setGrade('B');
            if(a.weight < 200)
                a.setGrade('C');
            return a;

        } ).collect(Collectors.toList());

        System.out.println(collect);

    }
}