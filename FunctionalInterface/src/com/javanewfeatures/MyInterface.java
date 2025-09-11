package com.javanewfeatures;

@FunctionalInterface
public interface MyInterface {
    public void sayHello();  //abstract methods
    default void sayBye(){};  //default methods
    public static void sayOk(){};
}
