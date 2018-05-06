public class Girl {
    String name;
    int age;



    void goToCinema(){
        System.out.println("go");
    }


    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
