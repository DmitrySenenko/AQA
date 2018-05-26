package labs.Lesson7;

public class Main {

    public static void main(String[] args) {
        /*My a = new A();
        a.m();
        a = new B();
        a.m();*/

        /*My a = (s) -> System.out.println(s+1);
        a.m(2);
        a = (s) -> System.out.println(s+2);
        a.m(3);
        a = (s) -> System.out.println(s+3);
        a.m(4);
*/

        /*class D {
            int a;
            int b;

            public D(int a, int b) {
                this.a = a;
                this.b = b;
            }

            @Override
            public String toString() {
                return "D{" +
                        "a=" + a +
                        ", b=" + b +
                        '}';
            }
        }

        D d = new D(2, 3);
        System.out.println(d);
        */


        /*A a = new A(1);
        a.m();

        A.C c = new A.C(2);  //Вложенный
        c.m();

        A.B b = a. new B(3);
        b.m(); */

        //Todo Есть класс Банк, в рамках Банка есть аккаунт, номер и баланс, ложит деньги и снимает деньги. Создать 2 банка и создать по 2 счета, вывести информацию про счет

        /*Banks a = new Banks("PrivateBank");
        Banks.Account account = a.new Account(123,100);
        account.show();
        Banks a1 = new Banks("AlphaBank");
        Banks.Account account1=a1.new Account(144, 100);
        account1.show();
            */
        /*A a = new A();
        a.m();

        new A(){
            int d = 100;
            @Override
            void m() {
                System.out.println("B" +d);
            }
            void n(){
                System.out.println("N");
            }
        }.n();   //TODO почитать про Solid*/

        Apple a = Apple.C;
        System.out.println(a.i);

    }
}
