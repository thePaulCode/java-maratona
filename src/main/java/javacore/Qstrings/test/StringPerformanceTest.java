package javacore.Qstrings.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        contacString(10_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução String: " + (fim-inicio )+ "ms");

        inicio = System.currentTimeMillis();
        contacStringBuilder(1000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução SB: " + (fim-inicio )+ "ms");

        inicio = System.currentTimeMillis();
        contacStringBuffer(1000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução SBuffer: " + (fim-inicio )+ "ms");
    }

    private static void contacString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void contacStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void contacStringBuffer(int tamanho){
        StringBuffer sbf = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sbf.append(i);
        }
    }
}
