package interfaces;

public class Main {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        System.out.println(class1.add(5,7));
        System.out.println(class1.concatenate("dfsfs","sdfowitgh"));

        Class2 class2 = new Class2();
        System.out.println(class2.add(5,7));
        System.out.println(class2.concatenate("dfsfs","sdfowitgh"));

        Helper helper = new Helper();
        helper.displayAdd(class1,3,2);
        helper.displayAdd(class2,3,2);

        Class3 class3 = new Class3();
        //helper.displayAdd(class3,3,2);
    }
}
