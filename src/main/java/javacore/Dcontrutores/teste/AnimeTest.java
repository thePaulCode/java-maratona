package javacore.Dcontrutores.teste;


import javacore.Dcontrutores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Shippuden", "Luta",577, "Ação", "Akiama");

//        anime.init("Dz", "TV", 21, "Ação");

        anime.imprime();
    }
}
