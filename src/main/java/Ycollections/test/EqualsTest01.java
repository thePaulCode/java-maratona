package Ycollections.test;

import Ycollections.dominio.SmartPhone;

public class EqualsTest01 {
    public static void main(String[] args) {
//        String name = "Paul San";
//        String name2 = new String("Paul San");
//
//        System.out.println(name.equals(name2));

        SmartPhone phone1 = new SmartPhone("7STLL2", "Nokia");
        SmartPhone phone2 = new SmartPhone("7STLL2", "Nokia");
        // 2 var de referencia apontando cada uma para um obj
        // o obj em memoria de phone1 eh igual ao obj em memoria de phone2 ? false
        // necessario sobrescrever o equals()
        System.out.println(phone1.equals(phone2));
    }
}
