package com.defaultmethods;

interface Parent{
    default void sayHello(){
        System.out.println("Parent says Hello");
    }
}

interface Child {
    default void sayHello() {
        System.out.println("child says hello ");
    }
}


public class MyClass implements Parent,Child{
    public static void main(String[] args) {
        MyClass m = new MyClass();
        m.sayHello();
    }
    @Override
    public void sayHello() {
        System.out.println("My own implementation");
    }
}