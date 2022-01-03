package exceptions;

import java.math.BigInteger;
import java.util.Optional;

public class Main {

    public static void func1() throws Exception {
        throw new Exception("func1 exception");
    }

    public static void func2() {
        try {
            func1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Checked Exception
    public static void func3() throws Exception {
        func1();
    }

    // Runtime Exception
    public static void func4(Optional<DummyClass> d) {

        try {
            if (d.isPresent()) {
                d.get().x();
            }
        } catch (Exception e) {
            System.out.println("Catching NPE");
        }
    }

    public static void checkAge(Integer age) throws CheckedException1 {
        if (age < 18) {
            throw new CheckedException1();
        } else {
            System.out.println(("you're legal"));
        }
    }

    public static void checkAgeRuntime(Integer age) {
        if (age < 18) {
            throw new RuntimeException1();
        } else {
            System.out.println(("you're legal"));
        }
    }

    public static void main(String[] args) {
        //func2();

        //func3();

        func4(Optional.ofNullable(null));

        //try {
        //    checkAge(17);
        //} catch (Exception e) {
        //    e.printStackTrace();
        //}

        try {
            checkAgeRuntime(20);
            checkAge(17);
        } catch (CheckedException1 c) {
            System.out.println("Caught CheckedException1");
        } catch (RuntimeException1 r) {
            System.out.println("Caught RuntimeException1");
        }

    }
}
