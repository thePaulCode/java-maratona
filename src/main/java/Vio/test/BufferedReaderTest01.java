package Vio.test;

import java.io.*;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileReader fileReader = new FileReader(file);
                BufferedReader br = new BufferedReader(fileReader)){

            String linha;

            while ((linha = br.readLine()) != null)
                System.out.println(linha);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
