package javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static{
        System.out.println("Dentro staticBloco inicialização Funcionário");
    }
    {
        System.out.println("Bloco inicialização Funcionário");
    }
    public Funcionario(String nome) {
        super(nome);
        System.out.println("Construtor Funcionário");
    }

    public Funcionario(String nome, String cpf){
        super(nome, cpf);
    }

    public Funcionario(){}

    public void imprime(){
        super.imprime();
        System.out.println("Salário: R$"+this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+this.nome+ " recebi o salário de R$"+this.salario);
    }

    public void imprime(int a){

    }

    public double imprime(double b){
        return 0;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
