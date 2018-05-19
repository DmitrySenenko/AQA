package Lesson6;

public class A {

    int a;
    static int b;

    void m(){
        System.out.println("not static" + b);
    }
    static void m1(){
        System.out.println("static");
    }
}
