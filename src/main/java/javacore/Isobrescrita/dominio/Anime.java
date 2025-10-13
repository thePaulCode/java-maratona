package javacore.Isobrescrita.dominio;

public class Anime {
    private String nome;

    public Anime(){

    }
    public Anime(String nome){
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Anime é: "+this.nome);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    @Override
    public String toString(){
        return "Anime: " + nome;
    }
}
