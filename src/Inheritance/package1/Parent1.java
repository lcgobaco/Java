package Inheritance.package1;

public class Parent1 {
    String parent1PackageInstanceMethod()
    {
        return name() + ":" + age() + " Package Instance Method";
    }

    public String parent1PublicInstanceMethod()
    {
        return name() + ":" + age() +  " Public Instance Method";
    }

    protected String parent1ProtectedInstanceMethod()
    {
        return name() + ":" + age() + " Protected Instance Method";
    }

    private String parent1PrivateInstanceMethod()
    {
        return name() + ":" + age() + " Private Instance Method";
    }

    public static String staticName() {
        return "Parent1";
    }

    private String name() {
            return "Parent1";
    }

    public static String parent1StaticMethod() {
        return staticName() +  " Static Method";
    }

    public Integer age() {
        return 50;
    }
}
