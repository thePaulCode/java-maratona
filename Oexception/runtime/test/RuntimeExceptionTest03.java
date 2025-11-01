package javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    // checked -> Exception -- erro de compilação
    // unchecked -> RuntimeException --

    public static void main(String[] args) {
        String conexaoStatus = abreConexao();
        if(conexaoStatus == null){
            conexaoStatus = "Conexão Falhou...";
        }
        System.out.println(conexaoStatus);
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo o arquivo...");
            System.out.println("Editando o arquivo...");
            throw new RuntimeException();
           // return "Conexão aberta...";
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Fechando o recurso liberado pe OS...");
        }
        return null;
    }
}
