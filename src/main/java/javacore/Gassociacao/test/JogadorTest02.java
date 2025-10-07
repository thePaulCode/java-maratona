package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Romero");
        Time paraguay = new Time("Paraguay");

        jogador1.setTime(paraguay);
        jogador1.imprime();
    }
}
