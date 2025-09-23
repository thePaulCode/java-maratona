package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
         Carro saveiro = new Carro();
         saveiro.nome = "Saveiro";
         saveiro.modelo = "Robust";
         saveiro.ano = 2020;

        Carro monza = new Carro();
        monza.nome = "Monza";
        monza.modelo = "Italiano";
        monza.ano = 1990;

        monza = saveiro;

        System.out.println("Carro: "+saveiro.nome+" Modelo: "+saveiro.modelo+" Ano: "+saveiro.ano);
        System.out.println("Carro: "+ monza.nome+" Modelo: "+monza.modelo+" Ano: "+monza.ano);

    }
}
