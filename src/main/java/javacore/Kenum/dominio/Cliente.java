package javacore.Kenum.dominio;

public class Cliente {

    private String nome;

//    public static final String PESSOA_FISICA = "PESSOA_FISICA";
//    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

//    public Cliente(String nome, String tipo) {
////        if(!tipo.equalsIgnoreCase(PESSOA_FISICA) && !tipo.equalsIgnoreCase(PESSOA_JURIDICA)){
////            return;
////        }
//        this.nome = nome;
//
//    }


    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
