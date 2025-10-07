package javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome){
        this.nome = nome;
    }

    public Jogador(String nome, Time time) {
        this.nome = nome;
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void imprime(){
        System.out.print(this.nome + " - ");
        if(this.time != null){
            System.out.println(this.time.getNome());
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}
