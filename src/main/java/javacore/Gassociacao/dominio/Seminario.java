package javacore.Gassociacao.dominio;

public class Seminario {
    private String nome;
    private String local;
    private Aluno[] alunos;

    public Seminario(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public Seminario(String nome, String local, Aluno[] alunos) {
        this.nome = nome;
        this.local = local;
        this.alunos = alunos;
    }

    public void imprime(){
        System.out.println("\nSeminário ");
        System.out.println("Nome: "+this.nome + " - Local: "+this.local);
        if (alunos == null) return;
        System.out.println("Alunos:");
        for (Aluno aluno : alunos){
            System.out.println("Nome: "+aluno.getNome()+ " - Idade: "+aluno.getIdade());
        }
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
