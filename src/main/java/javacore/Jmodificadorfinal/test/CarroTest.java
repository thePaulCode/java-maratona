package javacore.Jmodificadorfinal.test;

import javacore.Jmodificadorfinal.dominio.Carro;
import javacore.Jmodificadorfinal.dominio.Comprador;
import javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest {
    public static void main(String[] args) {
        Carro a3 = new Carro();
        a3.setNome("A3");
        System.out.println(Carro.VELOCIDADE_LIMITE);

        Comprador comprador2 = new Comprador();

        System.out.println(a3.COMPRADOR);
        a3.COMPRADOR.setNome("Jiraya");
        System.out.println(a3.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("F7");
        ferrari.imprime();
    }
}
