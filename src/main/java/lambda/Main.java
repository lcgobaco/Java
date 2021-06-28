package lambda;

public class Main {

    public static Integer display(Integer x, Integer y, Lambda1 l) {
        return l.operate(x, y);
    }

    public static void main(String[] args) {;
        Integer sum = display(3, 4, (a, b) -> {
            return a + b;
            }
            );
        Integer difference = display(3, 4, (a, b) -> {return a - b;});
        Integer product = display(3, 4, (a, b) -> {return a * b;});
        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
    }
}
