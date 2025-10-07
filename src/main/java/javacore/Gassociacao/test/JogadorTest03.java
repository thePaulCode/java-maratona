package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Dida");
        Jogador jogador2 = new Jogador("Rincón");
        Jogador jogador3 = new Jogador("Vampeta");


        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
        Time time1 = new Time("SCCP", jogadores);

        jogador1.setTime(time1);
        jogador2.setTime(time1);
        jogador3.setTime(time1);

        System.out.println("Jogador 0..*-------1 Time");
        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();
        System.out.println("------------------------");

        System.out.println("Time 1-----0..* Jogador");
        time1.imprime();
        System.out.println("------------------------");


    }
}
