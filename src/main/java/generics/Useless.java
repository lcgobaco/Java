package generics;

public class Useless<T> {
    <T> T passThru(T x) {
        if (x instanceof Integer) {
            Integer r = (Integer) x + 1;
            return (T) r;
        }
        else if (x instanceof String) {
            T t1 = (T) (x + " no");
            return t1;
        }
        else {
            return x;
        }
    }
}
