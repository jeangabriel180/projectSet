package application;

import entities.Product;

import java.util.Set;
import java.util.TreeSet;

public class ProgramTreeSet {
    public static void main(String[] args) {
        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV",900.00));
        set.add(new Product("Notebook",1200.00));
        set.add(new Product("Tablet",400.00));

        for (Product p : set){
            System.out.println(p);
        }

    }
}
