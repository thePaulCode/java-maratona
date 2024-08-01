package Ycollections.test;

import Ycollections.dominio.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneListTest01 {
    public static void main(String[] args) {
        SmartPhone phone1 = new SmartPhone("7STLL1", "Nokia");
        SmartPhone phone2 = new SmartPhone("7STLL2", "iPhone");
        SmartPhone phone3 = new SmartPhone("7STLL3", "Motorola");

        List<SmartPhone> smartPhoneList = new ArrayList<>();

        smartPhoneList.add(phone1);
        smartPhoneList.add(phone2);
        smartPhoneList.add(phone3);

        smartPhoneList.forEach(System.out::println);

        SmartPhone phone4 = new SmartPhone("7STLL10", "Motorola");
        smartPhoneList.add(phone4);

        System.out.println(smartPhoneList.contains(phone4));

        final int indexSmartPhone4 = smartPhoneList.indexOf(phone4);
        System.out.println(indexSmartPhone4);
        smartPhoneList.forEach(System.out::println);

        System.out.println(phone1.hashCode() == phone4.hashCode());

    }
}
