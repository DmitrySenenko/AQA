package com.task2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.String;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("Введите кол-во цифр, которое планируете ввести!");
        try {
            Scanner scanner = new Scanner(System.in);
            int sc = scanner.nextInt();
            int[] numb = new int[sc];

            int sum = 0;


            System.out.println("Введите ващи числа, каждое последующее через Enter(");
            for (int i = 0; i < numb.length; i++) {
                numb[i] = scanner.nextInt();
            }

            for (int i = numb.length - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    String len = Integer.toString(numb[j]);
                    String len1 = Integer.toString(numb[j + 1]);
                    if (len.length() > len1.length()) {
                        int tmp = numb[j];
                        numb[j] = numb[j + 1];
                        numb[j + 1] = tmp;
                    }
                }
            }
            System.out.println("Массив по порядку длинн: " + Arrays.toString(numb));
            System.out.println("Самое короткое число " + numb[0]);
            System.out.println("Его длинна " + String.valueOf(Math.abs(numb[0])).length());
            System.out.println("Самое длинное число " + numb[numb.length - 1]);
            System.out.println("Его длинна " + String.valueOf(Math.abs(numb[numb.length - 1])).length());

            for (int i = numb.length - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (numb[j] > numb[j + 1]) {
                        int tmp = numb[j];
                        numb[j] = numb[j + 1];
                        numb[j + 1] = tmp;

                    }
                }
            }


            System.out.println("Массив по порядку: " + Arrays.toString(numb));

            for (int i = 0; i < numb.length / 2; i++) {
                int tmp = numb[i];
                numb[i] = numb[numb.length - 1 - i];
                numb[numb.length - 1 - i] = tmp;
            }
            System.out.println("Обратный порядок массива: " + Arrays.toString(numb));

            for (int i = 0; i < numb.length; i++) {
                String len = Integer.toString(numb[i]);
                sum += len.length();
            }


            System.out.println("Сумма массива: " + sum);
            int polusum = sum / sc;
            System.out.println("Полусумма массива: " + polusum);

            for (int i = 0; i < numb.length; i++) {
                String len = Integer.toString(numb[i]);
                if (len.length() >= polusum) {
                    System.out.println("Кол-во символов больше(или равно) полусумме:" + numb[i]);
                }
            }

            for (int i = 0; i < numb.length; i++) {
                String len = Integer.toString(numb[i]);
                if (len.length() < polusum) {
                    System.out.println("Кол-во символов меньше полусуммы:" + numb[i]);
                }
            }

            for (int i = 0; i < numb.length; i++) {
                for (numb[i] >= 10 || numb[i] < 99 || numb[i] <= -10 || numb[i] > -99) {
                    int n1 = numb[i] % 10;
                    int n2 = numb[i] / 10 % 10;
                    if (n1 != n2) {
                        System.out.println("Одинаковых цифр нет в числе: " + " " + numb[i]);
                    }
                    break;
                }for (numb[i] >= 100 && numb[i] < 100 && numb[i] <= -100 && numb[i] > -999) {
                    int n1 = numb[i] % 10;
                    int n2 = numb[i] / 10 % 10;
                    int n3 = numb[i] / 100 % 10;
                    if (n1 != n2 && n1 != n3 && n2 != n3) {
                        System.out.println("Одинаковых цифр нет в числе: " + " " + numb[i]);

                    }
                    break;
                } for (numb[i] >= 1000 && numb[i] < 9999 && numb[i] <= -1000 && numb[i] > -9999) {
                    int n1 = numb[i] % 10;
                    int n2 = numb[i] / 10 % 10;
                    int n3 = numb[i] / 100 % 10;
                    int n4 = numb[i] / 1000 % 10;
                    if (n1 != n2 && n1 != n3 && n1 != n4 && n2 !=n3 && n2 != n4 && n3 !=n4) {
                        System.out.println("Одинаковых цифр нет в числе: " + " " + numb[i]);

                    }break;

                }for (numb[i] >= 10000 && numb[i] < 99999 && numb[i] <= -10000 && numb[i] > -99999) {
                    int n1 = numb[i] % 10;
                    int n2 = numb[i] / 10 % 10;
                    int n3 = numb[i] / 100 % 10;
                    int n4 = numb[i] / 1000 % 10;
                    int n5 = numb[i] / 10000 % 10;
                    if (n1 != n2 && n1 != n3 && n1 != n4 && n1 !=n5 && n2 != n3 && n2 !=n4 && n2 != n5 && n3 != n4 && n3 != n5 && n4 !=n5 ) {
                        System.out.println("Одинаковых цифр нет в числе: " + " " + numb[i]);

                    }
                    break;

                }
            }

            System.out.println("Массив слева направо:");

            for (int i = numb.length - 1; i >= 0; i--) {
                System.out.print(numb[i] + " ");
            }

            System.out.println(" ");
            System.out.println("Массив сверху вниз:");

            for (int i = numb.length - 1; i >= 0; i--) {
                System.out.println(numb[i] + " ");
            }


            scanner.close();
        }catch (InputMismatchException err) {
            System.out.println("Вы ввели буквы, а нужно цифры");
        }catch (NegativeArraySizeException err) {
            System.out.println("Массив не может иметь отрицательную длинну");
        }catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("Массив не может иметь нулевую длину");
        }
    }
}
