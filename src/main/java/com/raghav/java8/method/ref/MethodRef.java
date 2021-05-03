package com.raghav.java8.method.ref;

public class MethodRef {

    public static void myMethod(){
        for(int i=0; i < 10; i++){
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {

        Runnable r = MethodRef::myMethod;

        Thread t = new Thread(r);
        t.start();

        for(int i=0; i < 10; i++){
            System.out.println("Parent Thread");
        }




    }
}
