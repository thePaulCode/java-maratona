package Ycollections.test;

import Ycollections.dominio.Magazine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {

    public static void main(String[] args) {
        List<Magazine> magazine = new ArrayList<>(6);
        MaganizeComparator maganizeComparator = new MaganizeComparator();

        magazine.add(new Magazine(5L, "Space Today", 14.99));
        magazine.add(new Magazine(6L, "Machine Learning", 10.99));
        magazine.add(new Magazine(2L, "AI Era", 55.99));
        magazine.add(new Magazine(4L, "Physics", 39.99));
        magazine.add(new Magazine(3L, "Motors", 5.99));
        magazine.add(new Magazine(1L, "Electronics", 24.99));

        // -(inserction point) -1
        // index 0, 1, 2, 3
        // values 0, 2, 3, 4

        magazine.sort(maganizeComparator);
        magazine.forEach(System.out::println);

        Magazine magazineToSearch = new Magazine(1L, "Electronics", 24.99);

       System.out.println(Collections.binarySearch(magazine, magazineToSearch, maganizeComparator));
    }
}
