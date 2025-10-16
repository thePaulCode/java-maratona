package javacore.Lclassesabastratas.dominio;

public class Gerente extends Funcionario {

    private String area;
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }


    public Gerente(String nome, double salario, String area){
        super(nome, salario);
        this.area = area;
    }

    @Override
    public void calculaBonus() {
        this.salario += salario * 0.1;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

}
