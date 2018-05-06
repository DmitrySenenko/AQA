

public class Lesson_4 {
    static double avg(int... a) {
        double sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum / a.length;
    }


    public static void main(String[] args) {
        //Girl Ira;
        //System.out.println(Ira);
        //System.out.println(new Girl());

        //new Girl().goToCinema();
        System.out.println(avg(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(avg(2, 2, 2, 2, 2, 2, 2, 2, 2));

    }
}
