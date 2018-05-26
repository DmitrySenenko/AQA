package labs.Lesson7;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

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

        Apple allapples[]= Apple.values();
        for(Apple a: allapples)
            System.out.println(a);

        System.out.println();

        ap=Apple.valueOf("Winesap");
        System.out.println("ap contains " + ap);
    }
}
