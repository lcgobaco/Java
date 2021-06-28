package StaticAndConstructors;

public class Class2 {
    //public src.StaticAndConstructors.Class1() {
    //    System.out.println("Inside no-are Constructor");
    //}
    String instanceName = "";
    static String staticName = "";
    Class2 childClass = null;


    public static String staticMethod() {

        //this.instanceMethod();
        return "src.StaticAndConstructors.Class2 static method " + staticName;
    }

    public String instanceMethod() {
        String result = "";
        if (childClass != null) {
            result = childClass.instanceMethod() + "; ";
        }
        result += "src.StaticAndConstructors.Class2 instance method " + instanceName;
        return result;
    }

    public static void staticMethod2() {
        staticMethod();

    }

    public void instanceMethod2() {
        staticMethod();
    }

    public static void main(String[] args) {

    }

}

/*
    Class -> Instance1/Object1
           -> Instance2/Object2

Can you call instance1 from instance2?

if you don't define a constructor, a no-args Constructor is created for you.
but once you create a constrcutor, the no-args Constructor would not be created for you.
 */