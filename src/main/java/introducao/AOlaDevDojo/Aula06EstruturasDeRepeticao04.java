package introducao.AOlaDevDojo;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
       // Dado o valor de um carro, descubra
        // em quantas vezes ele pode ser parcelado
        // Condição: valorParcela >= 1000

        double valorCarro = 30000.0D;
        double valorParcela = 0;

        for (int parcelas = (int) valorCarro; parcelas >=1 ; parcelas--) {
            valorParcela = valorCarro / parcelas;
           if(valorParcela < 1000)
               continue;
            System.out.println("Total Parcelas " + parcelas + " Valor R$ "+valorParcela);
        }
    }
}
