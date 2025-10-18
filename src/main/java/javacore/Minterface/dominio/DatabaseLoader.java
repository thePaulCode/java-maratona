package javacore.Minterface.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    // private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do DB...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do DB...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissões no DB...");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro de retrieveMaxDataSize - DataLoader");
    }
}
