package AOlaDevDojo;

public class Operadores {
    public static void main(String[] args) {

        int numero1 = 10;
        double numero2 = 33;

        double resultado = numero1 + numero2;
        String saida = "";

        System.out.println(resultado);
        System.out.println("Resultado é Par ou Ímpar? ");
        if(resultado%2==0)
            saida = "Par";
        else
            saida ="Ímpar";

        System.out.println(saida);

        //
        int idade = 28;
        float salario = 3500F;
        boolean isSalarioDentroDaLeiMaiorQueTrintaAnos = idade >= 30 && salario >= 4612;
        boolean isSalarioDentroDaLeiMenorQueTrintaAnos = idade < 30 && salario >= 3381;
        System.out.println("isSalarioDentroDaLeiMaiorQueTrintaAnos " + isSalarioDentroDaLeiMaiorQueTrintaAnos);
        System.out.println("isSalarioDentroDaLeiMenorQueTrintaAnos " + isSalarioDentroDaLeiMenorQueTrintaAnos);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;

        float valorPlayStation = 5000F;

        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;

        System.out.println("isPlayStationCincoCompravel " + isPlayStationCincoCompravel);

        // Atribuição =
        double bonus = 1800;
        bonus = bonus + 1000;
        bonus += 1500;
        bonus -= 2500;
        System.out.println("bonus " + bonus);

        //
        int incrementador = 0;
        incrementador += 1;
        incrementador++; // primeiro executa e só depois incrementa
        --incrementador; // primeiro decrementa e depois continua
    }
}
