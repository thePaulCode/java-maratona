package javacore.Gassociacao.dominio;

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("\n## Professor ##");
        System.out.println("Nome: "+this.nome);
        System.out.println("Especialidade: "+this.especialidade);
        if(this.seminarios ==null) return;
        System.out.println("-- Seminários cadastrados --");
        for (Seminario seminario : this.seminarios){
            System.out.println(seminario.getNome() + " - Local: "+ seminario.getLocal());
            if(seminario.getAlunos() == null || seminario.getAlunos().length==0) continue;
            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + " idade:" + aluno.getIdade());
            }

        }
    }
    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
