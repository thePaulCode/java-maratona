package javacore.Minterface.test;

import javacore.Minterface.dominio.DataLoader;
import javacore.Minterface.dominio.DatabaseLoader;
import javacore.Minterface.dominio.FileLoader;

public class DataLoaderTest {

    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();

        fileLoader.checkPermission();

        DatabaseLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();
    }


}
