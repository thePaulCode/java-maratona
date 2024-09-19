package Ycollections.test;

import Ycollections.dominio.Magazine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MaganizeComparator implements Comparator<Magazine>{
    @Override
    public int compare(Magazine magazine1, Magazine magazine2) {
        return magazine1.getId().compareTo(magazine2.getId());
    }
}
public class MagazineSortTest {
    public static void main(String[] args) {
        List<Magazine> magazine = new ArrayList<>(6);
        magazine.add(new Magazine(5L, "Space Today", 14.99));
        magazine.add(new Magazine(6L, "Machine Learning", 10.99));
        magazine.add(new Magazine(2L, "AI Era", 55.99));
        magazine.add(new Magazine(4L, "Physics", 39.99));
        magazine.add(new Magazine(3L, "Motors", 5.99));
        magazine.add(new Magazine(1L, "Electronics", 24.99));

        System.out.println(magazine);
        System.out.println("-----------------");

        Collections.sort(magazine);

        magazine.forEach(System.out::println);

        System.out.println("-----------------");

        Collections.sort(magazine, new MaganizeComparator());

        magazine.forEach(System.out::println);


    }
}
