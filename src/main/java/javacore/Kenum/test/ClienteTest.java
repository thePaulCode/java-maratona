package javacore.Kenum.test;

import javacore.Kenum.dominio.Cliente;
import javacore.Kenum.dominio.TipoCliente;
import javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente clientePf = new Cliente("Paul", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente clientePj = new Cliente("Robert", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(clientePf);
        System.out.println(clientePj);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println("valueOf: "+tipoCliente);

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Jurídica");
        System.out.println("tipoClientePorNomeRelatorio: "+tipoCliente2);
    }
}
