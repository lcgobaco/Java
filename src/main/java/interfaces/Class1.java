package interfaces;

public class Class1 implements Interface1 {
    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public String concatenate(String a, String b) {
        return a + b;
    }
}
