package Inheritance.package2;

import Inheritance.package1.Parent1;


// Different package subclass/child
public class Child2 extends Parent1 {
    public void test() {
        parent1ProtectedInstanceMethod();
        parent1PublicInstanceMethod();
    }

}
