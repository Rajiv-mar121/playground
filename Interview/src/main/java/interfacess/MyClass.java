package interfacess;

public class MyClass implements Interface1, Interface2 , Interface3{


    @Override
    public void myMethod() {
        System.out.println("From implementation class");
    }

    @Override
    public void method2() {
        Interface2.super.method2();
    }

    public static void main(String[] arg) {
        new MyClass().myMethod();
        new MyClass().defaultMethod();
    }
}
