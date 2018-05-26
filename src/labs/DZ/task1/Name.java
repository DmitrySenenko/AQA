package labs.DZ.task1;

import java.util.Scanner;

public class Name {
    public static void main (String[] args){
        System.out.println("Введите ваше имя");
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        System.out.println("Привет " + sc);
        scanner.close();
    }
}
