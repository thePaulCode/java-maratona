package Ycollections.review;

public class EqualsTst01 {
    public static void main(String[] args) {
        final Phone phone1 = new Phone("21P9A7S", "Nokia");
        final Phone phone2 = new Phone("21P9A7S", "Waio");

        System.out.println(phone1.equals(phone2));
    }
}
