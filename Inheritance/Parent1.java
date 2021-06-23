package Inheritance;

public class Parent1 {
    public String parent1InstanceMethod()
    {
        return name() + ":" + age() + " Instance Method";
    }

    public static String staticName() {
        return "Parent1";
    }

    public String name() {
            return "Parent1";
    }

    public static String parent1StaticMethod() {
        return staticName() +  " Static Method";
    }

    public Integer age() {
        return 50;
    }
}
