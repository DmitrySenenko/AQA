package labs.Lesson11;

import labs.Hash;
import labs.Lesson10.Girl;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    /*static HashMap<String,String> girlStringHashMap1 = new HashMap<String, String>();
        static {
            girlStringHashMap1.put("asd","kkkkk");
        };*/

    public static void main(String[] args) {
       /* HashMap<String,String> girlStringHashMap = new HashMap<String, String>(){{
            put("fff","jjjjj");
        }};*/

       /* System.out.println(girlStringHashMap);
        System.out.println(girlStringHashMap1);*/

        /*System.out.println(girlStringHashMap.getOrDefault("aaaa", "bbbbb"));*/
        /*System.out.println(girlStringHashMap.compute("asd",(s1,s2)->s1+s2));
        System.out.println(girlStringHashMap.computeIfPresent("asd",(s1,s2)->s1+"ssssssssssss"));*/


        /*TreeMap<String,Double> hm = new TreeMap<String,Double>();

        hm.put("Joe Doe", new Double(3434.34));
        hm.put("Tom Smith", new Double(123.22));
        hm.put("Jane Baker", new Double(1378.00));
        hm.put("Tod Hall", new Double(99.22));
        hm.put("Ralph Smith", new Double(-19.08));

        Set<Map.Entry<String,Double>> set=hm.entrySet();

        for(Map.Entry<String,Double> me:set){
            System.out.println(me.getKey() + ":");
            System.out.println(me.getValue());
        }

        System.out.println();

        double balance = hm.get("John Doe");
        hm.put("John Doe", balance+1000);

        System.out.println("John Doe's new balance" +hm.get("John Doe"));*/

        /*List<String> list1 = Arrays.asList("red", "green", "blue");
        Collections.sort(list1);
        System.out.println(list1);
        List<String> list2 = Arrays.asList("green", "red","yellow","blue");
        //Collections.sort(list2, Collections.reverseOrder());
        Collections.shuffle(list2);
        System.out.println(list2);

        List<String> list = Arrays.asList("red", "green", "blue");
        Collections.fill(list, "black");
        System.out.println(list);*/

        /*Collection <String> collections1= Arrays.asList("red", "cyan");
        Collection <String> collections2= Arrays.asList("red", "blue");
        Collection <String> collections3= Arrays.asList("pink", "tan");

        System.out.println(Collections.disjoint(collections1, collections2));
        System.out.println(Collections.disjoint(collections1, collections3));*/

        /*List<Integer> list3 = Arrays.asList(2,4,7,10,11,45,50,59,60,66);
        System.out.println("(1) Index:" + Collections.binarySearch(list3,7));
        System.out.println("(2) Index:" + Collections.binarySearch(list3,9));

        List<String> list4 = Arrays.asList("blue", "green", "red");
        System.out.println("(3) Index: " + Collections.binarySearch(list4, "red"));
        System.out.println("(3) Index: " + Collections.binarySearch(list4, "cyan"));*/

        /*Collection <String> collection = Arrays.asList("red", "cyan", "red");
        System.out.println(Collections.frequency(collection,"red"));*/

        String init[]={"One", "Two", "Three", "One", "Two", "Three"};
        List list1= new ArrayList(Arrays.asList(init));
        List list2= new ArrayList(Arrays.asList(init));
        list1.remove("One");
        System.out.println(list1);
        list2.removeAll(Collections.singleton("One"));
        System.out.println(list2);


    }
}
