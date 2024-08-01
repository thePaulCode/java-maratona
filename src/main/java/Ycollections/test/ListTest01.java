package Ycollections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList();
        List<String> nomes2 = new ArrayList();

        nomes.add("Stll");
        nomes.add("Santos");

        System.out.println(nomes);

        nomes2.add("Paul");
        nomes2.add("Snts");

        nomes.addAll(nomes2);
        System.out.println(nomes);
    }
}
