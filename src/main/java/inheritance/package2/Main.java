package inheritance.package2;

public class Main {
    public static void main(String[] args) {

        Child2 child2 = new Child2();
        System.out.println(child2.parent1PublicInstanceMethod());

        //System.out.println(Child1.parent1StaticMethod());
    }

    /*
    Access Modified in Java
    Public > Protected > Package (default) > Private

    Package = same package
    Protected = same package + Subclass/Child in different package
     */
}
