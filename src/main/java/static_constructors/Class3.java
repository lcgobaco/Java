package static_constructors;

public class Class3 {
    //public src.StaticAndConstructors.Class1() {
    //    System.out.println("Inside no-are Constructor");
    //}
    String instanceName = "";
    static String staticName = "";
    Class3 childClass = null;
    static Class3 staticChildClass = null;

    public Class3() {

    }

    public Class3(String name) {
        System.out.println("Hello "+name);
        this.instanceName = name;
        //src.StaticAndConstructors.Class1.staticName = name;

    }

    public Class3(Class3 childClass, String name) {
        this.childClass = childClass;
        this.instanceName = name;
    }

    public static String staticMethod() {

        //this.instanceMethod();
        return "src.StaticAndConstructors.Class1 static method " + staticName;
    }

    public String instanceMethod() {
        String result = "";
        if (childClass != null) {
            result = childClass.instanceMethod() + "; ";
        }
        result += "src.StaticAndConstructors.Class1 instance method " + instanceName;
        return result;
    }

    public static void staticMethod2() {
        staticMethod();

    }

    public void instanceMethod2() {
        staticMethod();
    }

    public static void main2(String[] args) {

    }
}

/*
    Class -> Instance1/Object1
           -> Instance2/Object2

Can you call instance1 from instance2?

 */