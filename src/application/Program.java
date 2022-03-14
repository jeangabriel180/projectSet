package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        // o mais rápido porém nn garante ordem
        //TreeSet mantem a ordem e o linked também
        Set<String> set = new HashSet<>();
        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        set.remove("Tablet");
//      set.removeIf(x -> x.length() >= 3);
        set.removeIf(x -> x.charAt(0) == 'T');

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }
    }
}
