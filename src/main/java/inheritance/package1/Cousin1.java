package inheritance.package1;

public class Cousin1 {
    public void test() {
        Parent1 parent1 = new Parent1();
        parent1.parent1PackageInstanceMethod();
        parent1.parent1PublicInstanceMethod();
        parent1.parent1ProtectedInstanceMethod();
    }
}
