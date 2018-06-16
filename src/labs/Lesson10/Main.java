package labs.Lesson10;

public class Main {

    public static void main(String[] args) {
        /*Gen<Integer> iOb;

        iOb=new Gen<Integer>(88);

        iOb.showType();

        int v = iOb.getOb();

        System.out.println("value: " + v);

        System.out.println();

        Gen<String> strOb = new Gen<String>("Generics Test");

        strOb.showType();

        String str=strOb.getOb();
        System.out.println("value: " + str);*/

        Integer nums[] = {1,2,3,4,5};
        Stats<Integer> iOb = new Stats<Integer>(nums);

        double v = iOb.average();
        System.out.println("iob avareage is " + v);

        Double dnums[] ={1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dOb = new Stats<Double>(dnums);

        double w = dOb.average();
        System.out.println("dob avarage is " + w);

        /*String stra[] = {"1", "2", "3", "4", "5"};
        Stats <String> strob = new Stats<String>(stra);

        double x = strob.average();
        System.out.println("strob average is " + v);*/
    }
}
