package Section10.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListasTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Darlene");
        list.add("Angela");
        list.add("Shayla");
        list.add("Olivia");

        list.add(3, "Carla");

        System.out.println(list.size());

        list.remove("Angela");

        for(String x: list){
            System.out.println(x );
        }

        System.out.println("------------------");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'O');
        list.add("Alison");
        list.add("Amanda");
        for(String x: list){
            System.out.println(x );
        }

        System.out.println("---------------");
        System.out.println("Index of Darlene: " + list.indexOf("Darlene"));
        System.out.println("Index of Angela: " + list.indexOf("Angela"));

        List<String> result = list.stream()
                            .filter(x -> x.charAt(0) == 'A')
                            .collect(Collectors.toList());

        for(String x: result){
            System.out.println(x);
        }

        System.out.println("-----------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

        System.out.println(name);
    }
}
