package labs.Lesson4;

public class Aspirant extends Student{
    String workName;

    public Aspirant(String name, int age, String workName) {
        super(name, age);  //конструктор родителя
        this.workName = workName;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "workName='" + workName + '\'' +
                '}';
    }
}
