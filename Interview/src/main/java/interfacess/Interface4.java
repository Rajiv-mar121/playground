package interfacess;

public interface Interface4 {
    void myMethod();

   default void method2(){
        System.out.println("From Interface 1");
    }
}
