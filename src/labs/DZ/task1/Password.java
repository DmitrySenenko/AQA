package labs.DZ.task1;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        System.out.println("Введите пароль");
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        System.out.println("Происходит сравнение с системным");
        String pas = "Пароль";

        if (sc.equals(pas)) {
            System.out.println("Пароли совпадают! Доброе пожаловать!");
        } else {
            System.out.println("Пароли не совпадают! Попробуйте ещё раз!");
        }scanner.close();
    }
}