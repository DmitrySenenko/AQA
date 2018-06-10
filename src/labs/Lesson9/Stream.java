package labs.Lesson9;

import java.awt.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.lang.String;

public class Stream {

    public static void main(String[] args) {
        //System.out.println("fdfsfsfsfsd45".chars()
        //.distinct()
        //.filter(s->(char)s=='f' || (char)s=='d')
        //.filter(s->(char)s!='4' & (char)s!='5')
        //.mapToObj(s->(char)s+"")
        //.collect(Collectors.joining()));
        //.count());

        //.mapToObj(s->(char)s+"")
        //.collect(Collectors.joining("_")));

        /*Arrays.stream("1,2,3,4,5,6,7,8,9,10".split(","))
                .map(Integer::parseInt)
                .filter(s->s%2==0)
                .map(s->s*2)
                .collect(Collectors.toList())
                //.map(i -> (i < 0) i%2=0)
                .forEach(System.out::println);*/

        //Random random = new Random();
       /* random.ints(1,10)
                .limit(10)
                .forEach(System.out::println);
        */
        /*Stream.generate ()->new Point(random.nextInt(10),random.nextInt(10))
                .limit(5)
                .forEach(System.out.println);
*/

       /* Consumer<String> printUpperCase =str->
                System.out.println(str.toUpperCase());
        printUpperCase.accept("Hello");*/
/*
        Pattern.compile(":")
                .splitAsStream("footbar:foo:bar")
                .filter(s->s.contains("bar"))
                .sorted()

                .collect(Collectors.joining(":"));


        Pattern pattern =
                Pattern.compile(".*gmail.\\.com");
        Stream.of("bob@gmail.com", "alice@hotmail.com")
                .filter(pattern.asPredicate())
                .count();*/
       /* System.out.println(Locale.getDefault());
        System.out.println(new Date());

        Locale.setDefault(Locale.GERMAN);
        System.out.println(Locale.getDefault());
        DateFormat.getDateInstance();
        System.out.println(new Date());

        Locale.setDefault(Locale.CHINA);
        Locale current = Locale.getDefault();

        System.out.println(current.getCountry());
        System.out.println(current.getDisplayCountry());
        System.out.println(current.getLanguage());
        System.out.println(current.getDisplayLanguage());*/

        NumberFormat nfGe = NumberFormat.getInstance(Locale.GERMAN);
        NumberFormat nfUs = NumberFormat.getInstance(Locale.US);
        NumberFormat nfFr = NumberFormat.getInstance(Locale.FRANCE);

        double iGe=0, iUs=0, iFr=0;

        String str="1.234,5";

        try{
            iGe = nfGe.parse(str).doubleValue();
            iUs = nfUs.parse(str).doubleValue();
            iFr = nfFr.parse(str).doubleValue();
        } catch (ParseException e) {
            System.err.print("Error position:" +e.getErrorOffset());
        }
        System.out.printf("Ge= %f\niUs=%f\niFr=%f", iGe, iUs, iFr);
        String sUs=nfUs.format(iGe);
        String sFr=nfFr.format(iGe);
        System.out.println("\nUs " + sUs + "\nFr " + sFr);

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.US);
        Date d = null;
        String str1 = "April 9, 2012";
        try {
            d = df.parse(str1);
            System.out.println(d);
        }catch (ParseException e){
            System.err.print("Error position: " + e.getErrorOffset());
        }
        df = DateFormat.getDateInstance(DateFormat.LONG, new Locale("ru", "RU"));
        System.out.println(df.format(d));
        df = DateFormat.getDateInstance(DateFormat.FULL,Locale.GERMAN);
        System.out.println(df.format(d));




    }
}


