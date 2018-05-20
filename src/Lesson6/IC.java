package Lesson6;

public interface IC {
    void m();

    default void m4(){
        System.out.println("Одинаковый метод");
    }
}
