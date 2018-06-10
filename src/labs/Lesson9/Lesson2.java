package labs.Lesson9;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Random;

public class Lesson2 {

    public static void main(String[] args) {
       /* String ssss = String.format("sdfdsfsdfsd %d dsfsdfdsfdsf %s",10,"jjhgjh");
        System.out.println((ssss));*/

        /*Formatter f= new Formatter();
        Calendar cal = Calendar.getInstance();
        f.format("%tr", cal);
        System.out.println(f); //12 часовой формат
        f= new Formatter();
        f.format("%tr",cal);
        System.out.println(f);  // Полноформатный вывод
        f=new Formatter();
        f.format("%tl:%tM", cal ,cal);
        System.out.println(f);   //вывод текущего времени
        f=new Formatter();
        f.format("%tB %tb %tm", cal, cal, cal);
        System.out.println(f);   //всевозмодный вывод месяца*/

        /*int a = 10;
        int c = 0;
        try {
            c = a / 0;
        } catch (ArithmeticException e) {
            c = 0;
        }
        System.out.println(c);*/


        /*int a = 0, b = 0, c = 0;
        Random r = new Random();
        for (int i = 1; i <= 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль в выборке:" + i);
                a = 0;
            }
            System.out.println("a :" + a + "Попытка: " + i);*/

       /* int a;
        try{
            a=args.length;
            int b = 42/a;
            int[] c = new int[a];
            c[a] = 666;
        }catch (ArithmeticException e) {
            System.out.println("Деление на ноль." +e);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("Уже после блока try-catch-catch.");*/

        try {
            throw  new MyExeption("Привет");
        } catch (MyExeption e) {
            e.gogogo();
            System.out.println(e.getMessage());
        }

    }
}
