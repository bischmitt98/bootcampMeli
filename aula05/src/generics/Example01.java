package generics;

public class Example01<T> {
    T obj;

    public Example01(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
