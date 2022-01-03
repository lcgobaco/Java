package generics;

public class Main {
    public static void main(String[] args) {
        Useless<Integer> u = new Useless<>();
        System.out.println(u.passThru(1));

        System.out.println(new Useless<String>().passThru("T"));
    }
}
