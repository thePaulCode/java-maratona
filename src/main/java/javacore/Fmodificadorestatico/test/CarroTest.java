package javacore.Fmodificadorestatico.test;

import javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro saveiro = new Carro("Saveiro", 280);
        Carro porsche = new Carro("Prorsche", 275);
        Carro audi = new Carro("Audi C3", 290);

        // static pertence a Classe
        Carro.setVelocidadeLimite(180);
        saveiro.imprime();
        porsche.imprime();
        audi.imprime();
    }
}
