package Zgenerics.test;

import Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodsTest01 {
    public static void main(String[] args) {

        criarArrayComUmObjeto(new Car("Saveiro"));
    }

    private static <T> void criarArrayComUmObjeto(T t){

        List<T> list = List.of(t);
        System.out.println(list);
    }
}

