package AOlaDevDojo;

import java.util.Date;

public class TiposPrimitivosExercicio {
    /***
     * Criar variávei para os campos descritos abaixo entre <> e imprima
     * a seguinte mensagem:
     *
     * Eu <nome>, morando no endereço <endereco>,
     * confirmo que recebi o salário de <salario >, na data <data>.
     ***/
    public static void main(String[] args) {
        String nome = "Stll";
        String endereco = "OB";
        double salario = 70000.12D;
        String dataRecebimentoSalario = "07/02/204";

        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de R$"+salario+", na data "+dataRecebimentoSalario+".";
        System.out.println(relatorio);

    }

}
