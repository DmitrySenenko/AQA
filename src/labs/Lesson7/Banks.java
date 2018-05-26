package labs.Lesson7;


import java.util.Scanner;

public class Banks {

   /* Scanner scanner = new Scanner(System.in);
    int sc = (int) scanner.nextDouble();*/

    /*class PrivateBank{

        String account = "Dmitry";
        double balance = 134.0;
        String number = "1111 2222 3333 4444";

        void popoln(double){
            balance+=sc;
        }
        void cleane(double){
            System.out.println("Вы сняли все деньги: " + balance);
            balance = 0;
            System.out.println("Ваш баланс" + balance);
        }



    }*/

    /*String title;
            public Bank1(String title){

            }

            class Account{
                int number;
                double balance;
            }

            public Account ()

            void setMoney(double money){
                if (money>0){
                    balance+=money;
                }
            }



            void getMoney(double money){
                if (money< balance){
                    balance-=money;
                }
            }
            void show(){
                System.out.printf("Bank - %s, account number %d , balance - %g\n" , title, number, balance);
            }
        }*/
    public class Bank {
        String title;

        public Bank(String title) {
            this.title = title;
        }

        class Account {
            int accountNumber;
            double accountBalance;

            public Account(int accountNumber, double accountBalance) {
                this.accountNumber = accountNumber;
                this.accountBalance = accountBalance;
            }


            void setMoney(double money) {
                if (money > 0) {
                    accountBalance += money;
                }
            }

            void getMoney(double money) {
                if (money < accountBalance) {
                    accountBalance -= money;
                }
            }

            void show() {
                System.out.printf("Bank - %s, account number - %d, balance - %g",
                        title, accountNumber, accountBalance);
                System.out.println();
            }
        }
    }
}
