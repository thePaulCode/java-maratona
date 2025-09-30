package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.divideDoisNumeros(10.5, 0));
        System.out.println(calculadora.divideDoisNumeros02(10.5, 0));
        calculadora.imprimiDivisaoDeDoisNumeros02(21,2);
    }
}
