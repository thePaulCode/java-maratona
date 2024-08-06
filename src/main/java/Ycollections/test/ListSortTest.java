package Ycollections.test;

import Ycollections.dominio.Magazine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest {
    public static void main(String[] args) {
        List<String> magazine = new ArrayList<>(6);
        magazine.add("Deustch Welle");
        magazine.add("Nasa");
        magazine.add("NatGeo");
        magazine.add("Discovery");
        magazine.add("SpaceX");
        magazine.add("Anatomy");

        Collections.sort(magazine);

        magazine.forEach(System.out::println);

        Magazine magazine1 = new Magazine(null, null, null);
        System.out.println(magazine1);
    }
}
