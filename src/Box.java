
class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return height*width*depth;
    }

}


class BoxDemo {
        /*public static void main(String[] args) {
            Box mybox = new Box();
            double vol;
            mybox.width = 10;
            mybox.height = 20;
            mybox.depth = 15;

           vol = mybox.width * mybox.height * mybox.depth;
            System.out.println("Объем равен: " + vol);*/


    static class BoxDemo3 {
        public static void main(String[] args) {
            Box mybox1 = new Box();
            Box mybox2 = new Box();

            mybox1.width = 10;
            mybox1.height = 20;
            mybox1.depth = 15;

            mybox2.width = 3;
            mybox2.height = 6;
            mybox2.depth = 9;


            double vol = mybox1.volume();
            System.out.println("Volume is " + vol);

            double vol2= mybox2.volume();
            System.out.println("Volume is " + vol2);
        }
    }
}
