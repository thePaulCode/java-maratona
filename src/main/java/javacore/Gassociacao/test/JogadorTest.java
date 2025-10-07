package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Ronaldo Bruxo");
        Jogador jogador3 = new Jogador("Ronaldo Nazário");
        Jogador[] selecao = new Jogador[]{jogador1, jogador2, jogador3};

        for (Jogador jogador : selecao){
            jogador.imprime();
        }
    }
}
