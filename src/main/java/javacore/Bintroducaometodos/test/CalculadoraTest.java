package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.multiplicaDoisNumeros(10,12);

        calculadora.somaDoisNumeros();
        System.out.println("Finalizando 01");
        calculadora.subtraiDoisNumeros();
        System.out.println("Fim da execução");
    }
}
