package javacore.Oexception.runtime.test;

public class RuntimeExceptionTest04 {
    // checked -> Exception -- erro de compilação
    // unchecked -> RuntimeException --
    public static void main(String[] args) {
       try{
           throw new RuntimeException();
       } catch (NumberFormatException |ArithmeticException | ArrayIndexOutOfBoundsException ex){
           System.out.println("Dentro de NumberFormatException");
       }
    }
}
