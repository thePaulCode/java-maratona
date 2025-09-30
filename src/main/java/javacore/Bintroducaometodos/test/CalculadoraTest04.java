package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        Calculadora calculadora = new Calculadora();
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do Test");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }
}
