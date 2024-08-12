package Zgenerics.test;

import Ycollections.dominio.Magazine;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Type erasure
        list.add("Mac");
        list.add("Asus");
        //list.add(2024); type do not match
        list.forEach(System.out::println);
        //add(list, new Magazine("IEEE", 15.99));
    }

    private static  void add(List list, Magazine magazine){
        list.add(magazine);
    }
}
