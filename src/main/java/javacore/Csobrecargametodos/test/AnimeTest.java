package javacore.Csobrecargametodos.test;

import javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Dz", "TV", 21, "Ação");

        anime.imprime();
    }
}
