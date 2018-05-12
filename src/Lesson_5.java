public class Lesson_5 {

   /* static void m(){                //Статический полиморфизм . Методы перегружены (имеют одно имя)
        System.out.println("m()");
    }*/
    /*static void m(int a){
        System.out.println("m(int a)");
    }*/
   /* static void m(int a , int b){
        System.out.println("m(int a, int b)");
    }*/
    /*static void m(double a){
        System.out.println("m(double a)");
    }*/
    /*static int m(int ...a) {
        System.out.println("m(int ...a)");
        return 1;
    }*/

   /* public static void aMethod (byte val){
        System.out.println("byte");
    }

    public static void aMethod(short val){
        System.out.println("short");
    }*/

    /*public static void aMethod(long val1, int val2){
        System.out.println("long, int");
    }

    public static void aMethod(int val1, long val2){
        System.out.println("int, long");
    }*/

    int a,b;

    Lesson_5(int i, int j){
        a = i;
        b = j;
    }

    boolean equals (Lesson_5 o){
        if(o.a == a && o.b ==b) return true;
        else return false;
    }


    public static void main(String[] args) {

        /*Girl ira = new Girl("Ira", 23);
        Girl iral = new Girl();
        System.out.println(ira1);
        ira1 = null;
        System.gc();*/

        //m();
        //m(11);
        //m(11, 12);

        //aMethod(9L , 10);

        Lesson_5 ob1 = new Lesson_5(100,22);
        Lesson_5 ob2 = new Lesson_5(100,22);
        Lesson_5 ob3 = new Lesson_5(-1,-1);

        System.out.println("ob1 == ob2: " + ob1.equals(ob2));
        System.out.println("ob1 == ob3: " + ob1.equals(ob3));



    }
}
