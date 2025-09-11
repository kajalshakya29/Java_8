package com.javanewfeatures;

import java.security.PublicKey;

@FunctionalInterface
public interface Child extends Parent{ //STILL A FUNCTIONAL INTERFACE

    //ON DEFINING SAME METHOD THEN//STILL A FUNCTIONAL INTERFACE
    public void sayHello();
    default void sayBye(){};
    public static void sayOk(){};
}
