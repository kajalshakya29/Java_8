package creating_thread_using_lambda;

public class Main {
    public static void main(String[] args) {

        //---->>>FUNCTIONAL INTERFACE LAMBDA EX KA TYPE HOTA HAI(DATATYPE)
        //--->>>IT IS THE IMPLEMENTATION OF THE RUN METHOD
        //----->>>>>FI=LE
       Runnable runnable=() ->{
           for (int i = 0; i < 10; i++) {
               System.out.println("Hello "+i);
           }
       };
        Thread childThread=new Thread(runnable);
        childThread.start();
        childThread.run();
        for (int i = 0; i < 10; i++) {
            System.out.println("Bye "+i);
        }
    }
}
