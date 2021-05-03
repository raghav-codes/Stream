package com.raghav.java8.method.ref;

public class MyClass{

    public void myMethodClass(int i){
        System.out.println(i);
    }
    public static void main(String[] args) {
        MyInterface f = i-> System.out.println(i);
        f.myMethod(10);

        MyClass c = new MyClass();
        MyInterface f1 = c::myMethodClass;

        f.myMethod(20);


    }


}
