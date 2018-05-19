package Lesson6;

import java.util.Arrays;
import Lesson6.Ball;

public class Main {

    //static final int CONST = 10;
    //static final int[] CONS = {1,2,3,4,5};


    public static void main(String[] args) {

        //CONST = 100;
        //CONS[2] =100;
        //System.out.println(Arrays.toString(CONS));
       /* A a = new A();
        a.m();
        a = new C();
        a.m();
        a = new B();
        a.m();*/

       /*Ball sd= new Ball("red");
        System.out.println(sd);
        System.out.println(Ball.getCountInstance());
        System.out.println(Ball.count);*/

        /*System.out.println(A.b);
        A.m1();
        A a = new A();
        a.m1();
        System.out.println(a.b);*/

        B.m1();
        System.out.println(B.b);  //100
        System.out.println(A.b);  //0
        B b = new B();

    }
}
