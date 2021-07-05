package streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(Integer.valueOf(95));
        arrayList2.add(45);
        arrayList2.add(-56);

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "Lucas");
        hashMap.put("2", "Michael");
        hashMap.put("3", "Grace");
        hashMap.put("4", "Audrey");

        List<Name> nameList = new ArrayList<>();

        nameList.add(new Name("Lucas", "Gobaco"));
        nameList.add(new Name("Audrey", "Gobaco"));
        nameList.add(new Name("Michael", "Gobaco"));
        nameList.add(new Name("Grace", "Gobaco"));

        List<String> firstNames =
                nameList.stream().map(Name::getFirstName).collect(Collectors.toList());

        firstNames.stream().forEach((e) -> {
            System.out.println("Using collector:"+e);
        });

        OneParameter mapFunction = (e) -> {
            return e.getFirstName();
        };

        nameList.stream().map((e) -> {
            return e.getFirstName();
        })
                .forEach((e) -> {
                    System.out.println("Stream Map:" + e);
                });

        for (String v : hashMap.values()) {
            System.out.println(v);
        }

        hashMap.values().stream().forEach((e) -> {
            System.out.println("stream version:" + e);
        });

        for (String v : hashMap.keySet()) {
            System.out.println(v);
        }

        hashMap.keySet().stream().forEach((e) -> {
            System.out.println("stream version:" + e);
        });

        for (String k : hashMap.keySet()) {
            System.out.println(k + ":" + hashMap.get(k));
        }

    }
}
