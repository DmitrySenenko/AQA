package com.Lesson5;

public class Main {

    public static void main(String[] args) {
        A a = new A(11, 23);
        A b = new A(11, 23);
        System.out.println(a.getClass().getSimpleName());
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println("qwery".hashCode());
        System.out.println("qwery".hashCode());
        System.out.println(a.equals(b));

    }
}
