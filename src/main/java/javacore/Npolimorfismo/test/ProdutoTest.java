package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Televisao;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Tomate tomate = new Tomate("Tomate Cereja", 10.99);
        Computador computador = new Computador("MCos", 14000);
        Televisao televisao = new Televisao("LG 70\"", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
