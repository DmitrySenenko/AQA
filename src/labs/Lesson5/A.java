package labs.Lesson5;

public class A implements Cloneable{
    int a;
    int b;

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override                                  //Если не переопределён, то будет сравнивать ссылки на объект
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        A a1 = (A) o;

        if (a != a1.a) return false;
        return b == a1.b;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        return result;
    }

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
