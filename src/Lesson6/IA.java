package Lesson6;

public interface IA extends IB, IC {
        int a = 10; //final static
        int [] s= {1,2,3};

        static void m1(){
            System.out.println("hi!");
        }

        void m2();
        default void m3() {
            System.out.println("Hi from interface");
        }

    @Override
    default void m4() {
        IC.super.m4();  // Указываем из какого интерфейса мы берём метод
    }
}
