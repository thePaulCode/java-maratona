package Zgenerics.test;

abstract class Animal{
    public abstract void consulta();
}
class Dog extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consultando Dog");
    }
}

class Cat extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consultando Cat");
    }
}
