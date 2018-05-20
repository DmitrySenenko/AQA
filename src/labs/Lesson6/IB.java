package labs.Lesson6;


@FunctionalInterface

public interface IB {
    void m();

    default void m4(){
        System.out.println("Одинаковый метод");
    }
}
