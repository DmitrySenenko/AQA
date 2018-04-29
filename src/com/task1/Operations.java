package com.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        System.out.println("Для запуска программы необходимо знать сколько чисел вы будете вводить. Напишите кол-во цифр");
        try {
            Scanner scanner = new Scanner(System.in);
            int sc = scanner.nextInt();
            int[] numb = new int[sc];
            int max = numb[0];
            int min = numb[0];
            if (sc < 2) {
                System.out.println("Недостаточное кол-во цифр! Вывод операций невозможен!");
            } else {
                int maxline = sc;
                int polmaxline = sc / 2;
                System.out.println("Введите ващи числа, каждое последующейй через Enter!");
                for (int i = 0; i < numb.length; i++) {
                    numb[i] = scanner.nextInt();
                }

                for (int i = 0; i < numb.length; i++) {
                    if (numb[i] % 2 == 0) {
                        System.out.println("Это четное число: " + numb[i]);
                    } else {
                        System.out.println("Это НЕчетное число: " + numb[i]);
                    }
                }
                for (int i = 0; i < numb.length; i++) {

                    if (numb[i] % 3 == 0 | numb[i] % 9 == 0) {
                        System.out.println("Это число делится на 3 или 9: " + numb[i]);
                    } else if (numb[i] % 5 == 0 & numb[i] % 7 == 0) {
                        System.out.println("Это число делится на 5 и 7: " + numb[i]);
                    }
                }
                for (int i = 0; i < numb.length; i++) {
                    if (numb[i] > max) {
                        max = numb[i];
                    }
                }
                for (int i = 0; i < numb.length; i++) {
                    if (numb[i] < numb[0]) {
                        min = numb[i];
                    }
                }
                if (numb.length % 2 == 0) {
                    int sumleft = 0;
                    int sumright = 0;
                    for (int i = polmaxline - 1; i >= 0; i--) {
                        sumleft = sumleft + numb[i];
                    }
                    for (int i = polmaxline; i < maxline; i++) {
                        sumright = sumright + numb[i];
                    }
                    System.out.println("Сумма половин:" + sumleft + " " + "и" + " " + sumright);
                    if (sumleft == sumright) {
                        System.out.println("Счастливые числа найдены:");
                        for (int i = polmaxline - 1; i >= 0; i--) {
                            System.out.print(numb[i] + " ");
                        }
                        System.out.println(" ");
                        System.out.println("И ");
                        for (int i = polmaxline; i < maxline; i++) {
                            System.out.print(numb[i] + " ");
                        }
                        System.out.println(" ");
                    } else {
                        System.out.println("Счастливых цифр в данном массиве не обнаружено");
                    }
                } else {
                    System.out.println("Определение счастливых чисел не возможно, размерность не делится на 2");
                }
                for (int i = 0; i < numb.length; i++) {
                    if (numb[i] >= 100 && numb[i] < 1000) {
                        int n1 = numb[i] % 10;
                        int n2 = numb[i] / 10 % 10;
                        int n3 = numb[i] / 100 % 10;
                        if (n1 != n2 && n1 != n3 && n2 != n3) {
                            System.out.println("Одинаковых цифр нет в числе: " + " " + numb[i]);

                        }

                    }
                }

                System.out.println("Максимальное число массива: " + max);
                System.out.println("Минимальное число массива: " + min);

            }
            scanner.close();
        } catch (InputMismatchException err) {
            System.out.println("Вы ввели буквы, а нужно цифры");
        }
    }
}





