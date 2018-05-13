package labs.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("Сколько чисел генерировать?");
        try {
            Scanner scanner = new Scanner(System.in);
            int sc = scanner.nextInt();

            for (int i = 0; i < sc; i++) {
                System.out.println("Случайные числа в столбик: " + Math.random() * 100000);

            }
            for (int i = 0; i < sc; i++) {
                System.out.print("Случайные числа строкой :" + Math.random() * 100000 + " ");
            }scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели буквы, а нужно цифры");
        }
    }
}
