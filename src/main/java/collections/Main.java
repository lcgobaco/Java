package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    static List<Integer> arrayList = null;

    public static void setArrayList(List<Integer> aList) {
        arrayList = aList;
    }
    public void display(List<Integer> a) {
        for (Integer x: a) {
            System.out.println(x);
        }

        for (int ii = 0; ii < a.size(); ii++) {
            System.out.println(a.get(ii));
        }
    }

    public static void staticDisplay(List<Integer> a) {
        for (Integer x: a) {
            System.out.println(x);
        }

        for (int ii = 0; ii < a.size(); ii++) {
            System.out.println(a.get(ii));
        }
    }

    /** bad design */
    public static void staticDisplay2() {
        for (Integer x: arrayList) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        List<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(95);
        arrayList2.add(45);
        arrayList2.add(-56);

        new Main().display(arrayList2);
        staticDisplay(arrayList2);

        setArrayList(arrayList2);
        staticDisplay2();

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "Lucas");
        hashMap.put("2", "Michael");
        hashMap.put("3", "Grace");
        hashMap.put("4", "Audrey");

        for (String v: hashMap.values()) {
            System.out.println(v);
        }


        for (String v: hashMap.keySet()) {
            System.out.println(v);
        }

        for (String k: hashMap.keySet()) {
            System.out.println(k+":"+hashMap.get(k));
        }
    }
}
