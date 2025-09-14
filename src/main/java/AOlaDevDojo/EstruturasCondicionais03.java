package AOlaDevDojo;

public class EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 4000;
        String mensagemDoar = "Eu vou doar 500 para o Dev Paul.";
        String mensagemNaoDoar = "Não vou doar no nomento.";
        String resultado = salario > 5000? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
