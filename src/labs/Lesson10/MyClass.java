package labs.Lesson10;

class MyClass<K extends Comparable<K>> implements MyI<K> {

    K[] array;

    public MyClass(K[] array) {
        this.array = array;
    }

    @Override
    public K min() {
        K v = array[0];
        for (int i = 1; i < array.length; i++) {
            if (v.compareTo(array[i]) > 0) {
                v = array[i];
            }
        }
        return v;
    }

    @Override
    public K max() {
        K v = array[0];
        for (int i = 1; i < array.length; i++) {
            if (v.compareTo(array[i]) < 0) {
                v = array[i];
            }
        }
        return v;
    }
}

    /*T[] vals;

    MyClass(T[] o) {vals = o;}


    public T min(){
        T v = vals[0];

        for(int i=1;i<vals.length;i++)
            if(vals[i].compareTo(v)<0)v=vals[i];
        return v;
    }

    public T max(){
        T v =vals[0];
        for(int i=1; i<vals.length;i++)
            if(vals[i].compareTo(v)>0) v= vals[i];
        return v;
    }


}*/

