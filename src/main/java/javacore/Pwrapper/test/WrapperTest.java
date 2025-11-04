package javacore.Pwrapper.test;


public class WrapperTest {
    public static void main(String[] args) {
        // Primitivos - byte int char short long double float boolean

        Byte byteW = 12;
        Short shortW = 1;
        Integer intW = 1; //autoboxing
        Long longW = 1L;
        Double doubleW = 1D;
        Float floatW = 1F;
        Character characterW = 'S';
        Boolean aBoolean = true;


        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("1");
        Character.isDigit('A');
        System.out.println(Character.isDigit('1'));
    }
}
