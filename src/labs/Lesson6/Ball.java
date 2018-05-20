package labs.Lesson6;

public class Ball {

    public static int count =0;  //Статическое поле для хранение кол-ва сущевствующих экземпляров класса

    static int getCountInstance(){ // Метод возвращает кол-ва существующих экземпляров класса
        return count;
    }

    private String color = "none";
    public  Ball(String color){
        this.color=color;
        count++;  //увеличивает значение счетчика
    }

    protected void finalize(){
        System.out.println("ASD");
        count--;  //Уменьшает значение счетчика
    }
}
