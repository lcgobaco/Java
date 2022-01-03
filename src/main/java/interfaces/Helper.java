package interfaces;

public class Helper {
    public void displayAdd(Interface1 i, Integer a, Integer b) {
        System.out.println(i.add(a,b));
    }
    public void displayConcatenate(Interface1 i, String a, String b) {
        System.out.println(i.concatenate(a,b));
    }
}
