package labs.Lesson7;

public enum Apple {   //модификатор доступа только private
    A,B,C("1:00", 60 , "1AM"),D;

    Apple(String s, int i, String s1) {
        this.s = s;
        this.i = i;
        this.s1 = s1;
    }

    String s;
    int i;
    String s1;
    int a;

    Apple(int a) {
        this.a = a;
    }



    Apple() {

    }
}
