package interfacess;

public interface Interface2 {

    void myMethod();

    default void method2(){
        System.out.println("From Interface 2");
    }
}
