package com.task2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("Введите кол-во цифр, которое планируете ввести!");
        try {
            Scanner scanner = new Scanner(System.in);
            int sc = scanner.nextInt();
            int[] numb = new int[sc];


            System.out.println("Введите ващи числа, каждое последующейй через Enter!");
            for (int i = 0; i < numb.length; i++) {
                numb[i] = scanner.nextInt();
            }

                for (int i = numb.length - 1; i >= 0; i--) {
                    for (int j = 0; j < i; j++) {
                        if (numb[j] > numb[j + 1]) {
                            int tmp = numb[j];
                            numb[j] = numb[j + 1];
                            numb[j + 1] = tmp;

                        }
                    }
                }
            System.out.println("Самое короткое число " + numb[0]);
            System.out.println("Его длинна " + String.valueOf(Math.abs(numb[0])).length());
            System.out.println("Самое длинное число " + numb[numb.length-1]);
            System.out.println("Его длинна " + String.valueOf(Math.abs(numb[numb.length-1])).length());

            System.out.println("Массив по порядку: " + Arrays.toString(numb));

            for (int i = 0; i < numb.length / 2; i++) {
                int tmp = numb[i];
                numb[i] = numb[numb.length - 1 - i];
                numb[numb.length - 1 - i] = tmp;
            }
            System.out.println("Обратный порядок массива: " + Arrays.toString(numb));
            System.out.println("Обратный порядок массива: " + Arrays.toString(numb));





            scanner.close();
        }catch (InputMismatchException err) {
            System.out.println("Вы ввели буквы, а нужно цифры");
        }
    }
}
