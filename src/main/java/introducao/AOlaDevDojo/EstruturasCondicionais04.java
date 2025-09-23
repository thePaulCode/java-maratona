package introducao.AOlaDevDojo;

public class EstruturasCondicionais04 {
    public static void main(String[] args) {

        double salario = 69000;
        double taxaASerPaga = 0;

        if(salario <= 3412){
            taxaASerPaga = salario*0.097;
        } else if (salario >= 34713 && salario <= 68507) {
            taxaASerPaga = salario*0.3735;
        } else {
            taxaASerPaga = salario*0.4950;
        }
        System.out.println("Meu salário: " + salario + " Taxa a ser paga: " + taxaASerPaga);
    }
}
