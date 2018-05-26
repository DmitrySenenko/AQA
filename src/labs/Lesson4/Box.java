package labs.Lesson4;

class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }


    double volume() {
        return height * width * depth;
    }

}


/*class BoxDemo {
        public static void Main(String[] args) {
            Box mybox = new Box();
            double vol;
            mybox.width = 10;
            mybox.height = 20;
            mybox.depth = 15;

           vol = mybox.width * mybox.height * mybox.depth;
            System.out.println("Объем равен: " + vol);*/


/*class BoxDemo3 {
    public static void Main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;*/

        /*mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;


        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);*/


   /* }
}*/

class BoxDemo7 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        double vol;

        vol = mybox1.volume();
        System.out.println("volume is " + vol);

        vol = mybox2.volume();
        System.out.println("volume is " + vol);
    }
}

