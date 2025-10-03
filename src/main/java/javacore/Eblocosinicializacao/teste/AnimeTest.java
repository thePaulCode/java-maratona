package javacore.Eblocosinicializacao.teste;

import javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Chaves");
        System.out.println(" ");
        System.out.println(anime.getNome());;
        Anime anime1 = new Anime("Chapolin");
        System.out.println(" ");
        System.out.println(anime1.getNome());;

    }
}
