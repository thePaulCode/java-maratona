package AOlaDevDojo;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
       // Dado o valor de um carro, descubra
        // em quantas vezes ele pode ser parcelado
        // Condição: valorParcela >= 1000

        double valorCarro = 30000.0D;
        double valorParcela = 0;
        int totalParcelas = 0;

        for (int i = 1; i <= valorCarro; i++) {
            valorParcela = valorCarro / i;
            if(valorParcela < 1000)
                break;
            System.out.println("Total Parcelas " + i + " Valor R$ "+valorParcela);
        }
    }
}
