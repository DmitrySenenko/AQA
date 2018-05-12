public class Lesson_5 {

    static void m(){                //Статический полиморфизм . Методы перегружены (имеют одно имя и один тип данных)
        System.out.println("m()");
    }
    /*static void m(int a){
        System.out.println("m(int a)");
    }*/
    static void m(int a , int b){
        System.out.println("m(int a, int b)");
    }
    /*static void m(double a){
        System.out.println("m(double a)");
    }*/
    static int m(int ...a) {
        System.out.println("m(int ...a)");
        return 1;
    }

    public static void main(String[] args) {

        /*Girl ira = new Girl("Ira", 23);
        Girl iral = new Girl();
        System.out.println(ira1);
        ira1 = null;
        System.gc();*/

        //m();
        m(11);
        //m(11, 12);

    }
}
