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

    /*int a, b;

    Lesson_5(int i, int j) {
        a = i;
        b = j;
    }
*/
    /*boolean equals (Lesson_5 o){
        if(o.a == a && o.b ==b) return true;
        else return false;
    }*/

    /*void meth(Lesson_5 o) {
        o.a *= 2;
        o.b /= 2;
    }

    void meth(int a, int b) {
        a *= 2;
        b /= 2;
    }*/

    int a;

    Lesson_5(int i){
        a = i;
    }

    Lesson_5 incrByTen(){
        Lesson_5 temp = new Lesson_5(a+10);
        return temp;
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

        /*Lesson_5 ob1 = new Lesson_5(100,22);
        Lesson_5 ob2 = new Lesson_5(100,22);
        Lesson_5 ob3 = new Lesson_5(-1,-1);

        System.out.println("ob1 == ob2: " + ob1.equals(ob2));
        System.out.println("ob1 == ob3: " + ob1.equals(ob3));*/

        /*Lesson_5 ob = new Lesson_5(15, 20);
        int x = 10, y = 10;
        ob.meth(x,y);

        System.out.println(" x and y before call: " + x + " " + y);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);*/

        Lesson_5 ob1 = new Lesson_5(2);
        Lesson_5 ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2= ob2.incrByTen();
        System.out.println("ob2.a after second increase: " + ob2.a);
}
}
