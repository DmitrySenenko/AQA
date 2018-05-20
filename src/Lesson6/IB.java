package Lesson6;

public interface IB {
    void m();

    default void m4(){
        System.out.println("Одинаковый метод");
    }
}
