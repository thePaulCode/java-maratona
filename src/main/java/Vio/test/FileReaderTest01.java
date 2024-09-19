package Vio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileReader fileReader = new FileReader(file)) {
            int i;
            while ((i = fileReader.read()) != -1)
                System.out.print((char) i);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
