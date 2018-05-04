package com.task1;

public class Sum {
    public static void main(String[] args){
        int sum = 0;
        int pr = 1;
        if (args.length < 1){
            System.out.println("Недостаточное кол-во аргументов! Введите их в настройках!");
        }else {
            for (int i = 1; i <= args.length; i++) {
                sum = sum + i;
                pr = pr * i;
            }
        }
        System.out.println("Сумма аргументов: " + sum);
        System.out.println("Произведение аргументов: " + pr);
    }
}
