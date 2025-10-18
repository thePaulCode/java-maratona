package javacore.Minterface.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("File loader...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do Arquivo...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no Arquivo...");
    }
}
