package inheritance.package2;

import inheritance.package1.Parent1;

// Different package non-subclass
public class Cousin2 {
    public void test() {
        Parent1 parent1 = new Parent1();
        parent1.parent1PublicInstanceMethod();
    }
}
