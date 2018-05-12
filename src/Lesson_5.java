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

    public static void aMethod(long val1, int val2){
        System.out.println("long, int");
    }

    public static void aMethod(int val1, long val2){
        System.out.println("int, long");
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

        aMethod(9L , 10);
    }
}
