package labs.Lesson10;

public interface MyI<K extends Comparable<K>> {

    K min();
    K max();
}
