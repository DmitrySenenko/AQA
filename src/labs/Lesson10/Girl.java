package labs.Lesson10;

import java.util.Objects;

public class Girl implements Comparable<Girl> {

    String name;
    int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Girl girl = (Girl) o;
        return age == girl.age &&
                Objects.equals(name, girl.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Girl o) {
        return age-o.age;
    }
}
