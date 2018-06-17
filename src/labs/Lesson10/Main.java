package labs.Lesson10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import static labs.Lesson10.GenMethDemo.isIn;

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

        /*Integer nums[] = {1,2,3,4,5};
        Stats<Integer> iOb = new Stats<Integer>(nums);

        double v = iOb.average();
        System.out.println("iob avareage is " + v);

        Double dnums[] ={1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dOb = new Stats<Double>(dnums);

        double w = dOb.average();
        System.out.println("dob avarage is " + w);*/

        /*String stra[] = {"1", "2", "3", "4", "5"};
        Stats <String> strob = new Stats<String>(stra);

        double x = strob.average();
        System.out.println("strob average is " + v);*/

        /*Integer nums[]={1,2,3,4,5};

        if(isIn(2,nums))
            System.out.println("2 is in nums");

        if(isIn(7,nums))
            System.out.println("7 is in nums");

        System.out.println();

        String strs[] = {"one", "two", "three", "four", "five"};

        if(isIn("two", strs))
            System.out.println("two is in strs");
        if(!isIn("seven",strs))
            System.out.println("seven is not in strs");*/

        /*Integer inums[] = {3,6,2,8,6};
        Character chs[] = {'b', 'r' ,'p','w'};

        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Character> cob = new MyClass<Character>(chs);

        System.out.println("Max value in inums: " + iob.max());
        System.out.println("Min value in inums: " + iob.min());

        System.out.println("Max value in chs: " + cob.max());
        System.out.println("Min value in chs: " + cob.min());*/

        /*String[] s1={"Katya", "Yana", "Nata", "Tanya"};
        Integer[] s2 ={2,3,4,5,6,7,8,9};
        Girl[] s3 ={new Girl("Zenya", 18) , new Girl("Luda",22), new Girl("Anna", 30)};
        MyClass<Integer> integerMyClass = new MyClass(s2);
        MyClass<Girl> girlMyClass = new MyClass(s3);
        MyClass<String> stringMyClass = new MyClass(s1);

        System.out.println(stringMyClass.max());
        System.out.println(stringMyClass.min());
        System.out.println(girlMyClass.max());
        System.out.println(girlMyClass.min());
        System.out.println(integerMyClass.max());
        System.out.println(integerMyClass.min());*/

       TreeSet<String> hs = new TreeSet<>();

        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");

        System.out.println(hs);

        hs.forEach(s->System.out.println(s.hashCode()));

        System.out.println();

        for (String x:hs) {
            System.out.println(x.hashCode());
        }


       /* TreeSet Girl = new TreeSet();

        Girl.add("Katya");
        Girl.add("Yana");
        Girl.add("Tanya");
        Girl.add("Elena");
        Girl.add("Anna");
        Girl.add("Marina");
        Girl.add("Galya");
        Girl.add("Inna");*/

        //System.out.println(Girl);

        Set<Girl> strings = new TreeSet<>((s1,s2)->s1.name.compareTo(s2.name));

        strings.add(new Girl("Katya",22));
        strings.add(new Girl("Zanna",21));
        strings.add(new Girl("Zenya",20));
        strings.add(new Girl("Nata",23));
        strings.add(new Girl("Sasha",25));
        strings.add(new Girl("Nelly",27));

        System.out.println(strings);

    }
}
