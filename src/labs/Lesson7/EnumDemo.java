package labs.Lesson7;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;

        /*ap=Apple.RedDel;

        System.out.println("Value of ap: " + ap);
        System.out.println();

        ap=Apple.GoldenDel;

        if (ap==Apple.GoldenDel)
            System.out.println("ap contains GoldenDel.\n");

        switch (ap){
            case Jonathan:
                System.out.println("Jonathan is red");
                break;
        }
        */

        System.out.println("Here are all Apple constants");

        Apple allapples[] = Apple.values();
        for (Apple a : allapples)
            System.out.println(a);

        System.out.println();

        for (Apple a : Apple.values())
            System.out.println(a + " " + a.ordinal()); //Позиция константы в списке

        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        if (ap.compareTo(ap2) < 0)
            System.out.println(ap + " comes before " + ap2);

        if (ap.compareTo(ap2) > 0)
            System.out.println(ap2 + " comes before " + ap);

        if (ap.compareTo(ap3) == 0)
            System.out.println(ap + " equals " + ap3);

        System.out.println();

        if (ap.equals(ap2))
            System.out.println("Error!");
        if (ap.equals(ap3))
            System.out.println(ap+ " equals " + ap3);
        if (ap==ap3)
            System.out.println(ap + " == " + ap3);

        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains " + ap);
    }
}
