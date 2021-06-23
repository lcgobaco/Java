package Inheritance;

public class Main {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        System.out.println(child1.parent1InstanceMethod());
        //System.out.println(Child1.parent1StaticMethod());

        System.out.println("************");

        Parent1 parent1 = new Parent1();
        System.out.println(parent1.parent1InstanceMethod());
        //System.out.println(Parent1.parent1StaticMethod());
    }
}
