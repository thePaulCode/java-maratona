package javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    // checked -> Exception -- erro de compilação
    // unchecked -> RuntimeException --

    public static void main(String[] args) {
        try {
            int resultado = divisao(10, 0);
            System.out.println("Resultado da divisão: "+resultado);
        } catch (RuntimeException ex){
            ex.printStackTrace();
        }
        System.out.println("Código finalizado.");
    }

    /**
     *
     * @param a
     * @param b não pode ser 0 (zero)
     * @return
     * @throws IllegalArgumentException caso b seja 0 (zero)
     */
    private static int divisao(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0 (zero).");
        }
        return a / b;
    }
}
