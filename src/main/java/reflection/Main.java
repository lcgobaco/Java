package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class1 c1 = new Class1();

        //System.out.println(c1.getClass());

        Class c2 = Class1.class;
        Class c3 = Class.forName("reflection.Class1");

        if (c2 == c3) {
            System.out.println("c2 == c3");
        }
        System.out.println("3:" + c3.getSuperclass());

       System.out.println("4:" +c3.getDeclaredConstructors());

       for (Constructor c: c3.getDeclaredConstructors()) {
           System.out.println("5:" +c);
       }

       for (Method m: c3.getDeclaredMethods()) {
           System.out.println("6:" +m);
           for (Annotation a: m.getDeclaredAnnotations()) {
               System.out.println("6.1:" +a);

           }
       }

        for (Field m: c3.getDeclaredFields()) {
            System.out.println("7:" +m);
            System.out.println("7.1:" +m.getDeclaringClass());
        }

        for (Annotation m: Class1.class.getAnnotations()) {
            System.out.println("8:" +m);
        }

    }
}
