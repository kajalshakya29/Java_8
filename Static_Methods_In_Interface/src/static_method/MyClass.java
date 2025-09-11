package static_method;

interface A{
    static void sayHello(){ //---->>STATIC METHODS ALWAYS NEED BODY IN INTERFACE
        System.out.println("Hello !");
    }
}

//->> IMPLEMENTATION CLASS CAN'T SEE STATIC METHOD IN INTERFACE
public class MyClass implements A {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        //myClass.sayHello(); ----->> NOT POSSIBLE
        //MyClass.sayHello(); ----->> NOT POSSIBLE
        A.sayHello(); //--->>STATIC METHODS ALWAYS CALL BY ITS INTERFACE NAME
    }
}
