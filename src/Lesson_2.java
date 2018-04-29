import java.util.Arrays;
import java.util.Scanner;

public class Lesson_2 {

    public static void main(String[] args) {
        //float a = 0.5f;
        //System.out.println(.3f + .4f);
        //System.out.println((float)(.3 + .4));

        // объяснить почему System.out.println (.2 + .1)

        //System.out.println(12.0 / 0); // 12 / 0.0    // -0.0 = 0.0
        //System.out.println(Double.NEGATIVE_INFINITY);
        //System.out.println(Double.NEGATIVE_INFINITY * 100);

        //int b = 44;
        //System.out.println("\u2122"); //trademark unicode //разные типы пробелов
        //System.out.println("первая строка\nвторая строка"); // Экранируем через \ пример \" \%

        //char c1 = '1';
        //char c2 = '\u0031';
        //char c3 = 49;
        //System.out.println(c1 + c2 + c3); //49 + 49 + 49

        //char ch1 , ch2;

        //ch1 = 88; // code for X
        //ch2 = 'Y';

        //System.out.println("ch1 and ch2:");
        //System.out.println(ch1 + " " + ch2);

        //for (char i = 'a'; i <= 'z'; i++) {
        //    System.out.println("i = " + i); // или +(char)i
        // }

        //String a = "word";
        //System.out.println(a + " " + " Hello");
        //String a = "hi";
        //String b = new String("hi");
        //System.out.println(a==b);
        //System.out.println(a.equals(b)); //сравниваем //интерфейс, класс, массив
        //System.out.println("4 / 2 = " + 4 / 2 == "4 / 2 = 2"); // почему сработали ==

//        byte b1 = 50;
//        byte b2 = -99;
//        b1 += b2;
//        System.out.println("b1 =" + b1);
        //int a = 100;
        //System.out.println(a > 10 ? 10 : 100);
        /*System.out.println("Введите цифру дня недели");
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();*/
       /* if (sc > 0 && sc < 3) {
            System.out.println("Ты младенец");
        } else if (sc > 3 && sc < 6) {
            System.out.println("Ты ходишь в садик");
        } else if (sc > 6 && sc < 17) {
            System.out.println("Ты ходишь в школу");
        } else if (sc > 17 && sc < 23) {
            System.out.println("Ты ходишь в университет");
        } else if (sc > 23 && sc < 60) {
            System.out.println("Ты работаешь");
        } else if (sc > 60 && sc < 80) {
            System.out.println("Ты на пенсии");
        } else if (sc < 0) {
            System.out.println("Тебя ещё не придумали");
        } else {
            System.out.println("Приятных снов");
        }*/
       /*switch (sc) {
           case 1:
               System.out.println("Это понедельник");
               break;
           case 2:
               System.out.println("Это вторник");
               break;
           case 3:
               System.out.println("Это среда");
               break;
           case 4:
               System.out.println("Это четверг");
               break;
           case 5:
               System.out.println("Это пятница");
               break;
           case 6:
               System.out.println("Это суббота");
               break;
           case 7:
               System.out.println("Это воскресенье");
               break;

               default:
                   System.out.println("Такого дня недели не существует");
       }*/
       /* for (String arg : args) {
            System.out.println(arg);
        }*/
        /*int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }*/

        /* for ( int i = 0; i < 10; i++, System.out.println(i));*/
        /*int i = 10 ;
        do {
            System.out.println(i);
        } while (i > 10);*/
        /*int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }*/

        //int i = 0;
        /*for (int i = 0; i < k; i++){ //знаем кол-во
            if (i%2==0);
            System.out.println(i);*/

        /*while (i <= 100) { //Есть логическое выражение
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }*/

       /* int i = 100, j = 200;

        while (++i < --j);  //средина
        System.out.println(i);*/

        /*for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }*/

        /*String strInt = "123"; //из строки в цифры и обратно
        String strDouble = "123.45";
        int x ;
        double y;
        x = Integer.parseInt(strInt);
        y = Double.parseDouble(strDouble);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        strInt = String.valueOf(x + 1);
        strDouble = String.valueOf(y + 1);
        System.out.println("strInt=" + strInt);
        System.out.println("strDouble=" + strDouble);
        String str;
        str = "num=" + 345;
        System.out.println(str);*/

        /*System.out.println(Integer.toString(262));  // Преобразование числа в разные виды
        System.out.println(Integer.toBinaryString(262));
        System.out.println(Integer.toHexString(267));
        System.out.println(Integer.toOctalString(267));*/

        // Task1 (не делать полусумме)


        //int[][] a = {{1,1,1,1,1,1,1},{2,2,2,2},{1,2,3,4,5,6,7,8,9,0}};
        /*for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }*/

        /*for (int i : a) {
            System.out.println(i);

        }*/

        //System.out.println(Arrays.toString(a));

        //Arrays.stream(a).forEach(System.out::println);

       /* System.out.println(Arrays.deepToString(a));

        int[] a1 = new int[5]; //выделили память под 5 интов
        System.out.println(a);
        System.out.println(a1);*/

        int sum = 0;
        int nums[][] = new int[3][5];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i + 1) * (j + 1);


        for (int x[] : nums) {
            int sum1 = 0;
            for (int y : x) {
                System.out.println("Value is:" + y);
                sum += y;
                sum1 += y;
            }
            System.out.println("SumLine:" + sum1);
        }

        System.out.println("Summation:" + sum);

    }
}