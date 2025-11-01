package javacore.Oexception.runtime.test;

public class RuntimeExceptionTest {
    // checked -> Exception -- erro de compilação
    // unchecked -> RuntimeException --

    public static void main(String[] args) {
        Object object = null;
        int[] array = new int[2];
        System.out.println(array[1]);
    }
}
