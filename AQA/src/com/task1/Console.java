package com.task1;

public class Console {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println("Правильный порядок:" + i);
        }
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println("Обратный порядок:" + i);
        }
    }
}