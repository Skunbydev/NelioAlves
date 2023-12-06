package memoriesArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("Luiz");
        list.add("Ester");
        list.add("Maria");
        list.add(1, "João");
        System.out.println(list.size());
        for (String x : list) {
            System.out.println(x);
        }


        System.out.println("-----------------");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'L');

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------------");
        System.out.println("index of Maria " + list.indexOf("Maria"));

        System.out.println("--------3---------");
        List <String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-----------4---------");
        String name = list.stream().filter(x -> x.charAt(0) == 'E').findFirst().orElse(null);
        System.out.println(name);
    }
}
