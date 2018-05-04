package com.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("Введите кол-во цифр, которое планируете ввести!");
        try {
            Scanner scanner = new Scanner(System.in);
            int sc = scanner.nextInt();
            int[] m = new int[sc];







            scanner.close();
        }catch (InputMismatchException err) {
            System.out.println("Вы ввели буквы, а нужно цифры");
        }
    }
}
