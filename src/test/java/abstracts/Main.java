package abstracts;

public class Main {
    public static void main(String[] args) {
        AbstractClass1 abstractClass1 = new AbstractClass1() {
            @Override
            Integer add(Integer a, Integer b) {
                return a+b+2;
            }
        };

        AbstractClass1 abstractClass2 = new Class1();
        System.out.println(abstractClass1.add(3,4));
        System.out.println(abstractClass2.add(3,4));
        /*
            parent  = child
            child = parent (cannot)
         */
    }
}
