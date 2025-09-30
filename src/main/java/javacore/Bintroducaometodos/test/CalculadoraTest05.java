package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = new int[]{1, 2, 3, 4, 5};
        calculadora.sumaArray(numeros);
        calculadora.somaVarArgs(6,7,8,9,10);
    }
}
