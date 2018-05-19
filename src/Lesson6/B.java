package Lesson6;

public class B extends A {
    static int b = 100; //Перекрытие

    @Override
    void m() {
        System.out.println("B");
    }
}
