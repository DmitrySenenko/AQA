package labs.Lesson11;

import labs.Hash;
import labs.Lesson10.Girl;

import java.util.HashMap;

public class Main {

    static HashMap<String,String> girlStringHashMap1 = new HashMap<String, String>();
        static {
            girlStringHashMap1.put("asd","kkkkk");
        };

    public static void main(String[] args) {
        HashMap<String,String> girlStringHashMap = new HashMap<String, String>(){{
            put("fff","jjjjj");
        }};

       /* System.out.println(girlStringHashMap);
        System.out.println(girlStringHashMap1);*/

        /*System.out.println(girlStringHashMap.getOrDefault("aaaa", "bbbbb"));*/
        System.out.println(girlStringHashMap.compute("asd",(s1,s2)->s1+s2));
        System.out.println(girlStringHashMap.computeIfPresent("asd",(s1,s2)->s1+"ssssssssssss"));
    }
}
