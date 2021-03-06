package static_constructors;

class Main {
  public static void main(String[] args) {
    //src.StaticAndConstructors.Class1 xxx = new src.StaticAndConstructors.Class1();
    Class1 obj1 = new Class1("Lucas");
    Class1 obj2 = new Class1("Michael");
    Class1 obj3 = new Class1(obj2, "Audrey");
    Class1 obj4 = new Class1(obj1, "s2");
    Class2 obj5 = new Class2();
    //src.StaticAndConstructors.Class1 noArgClass1 = new src.StaticAndConstructors.Class1();

    Class3 obj8 = new Class3();

    //src.StaticAndConstructors.Class1 obj6 = new src.StaticAndConstructors.Class1();
    //src.StaticAndConstructors.Class2 obj7 = new src.StaticAndConstructors.Class2("hoy");

    System.out.println(Class1.staticMethod());
    System.out.println(obj1.instanceMethod());
    System.out.println(obj2.instanceMethod());
    System.out.println(obj3.instanceMethod());
    // test
    // changed from intellij


  }
}

/*
Synonyms:
  Class, static, class
     class variable
     class method
  Object, instance
     instance variable
     instance method
 */