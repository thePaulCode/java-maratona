package javacore.Qstrings.test;

import java.util.Arrays;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = " Bitze ";
        String numeros = "a012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("B", "P"));
        System.out.println(nome.toLowerCase());
        /**
         * beginIndex - inclusive
         * endIndex - exclusive
         * thus, length is (endIndex - beginIndex)
         **/
        System.out.println(Arrays.toString(numeros.substring(0, 2).split("")));
        System.out.println(nome.trim());

    }
}
