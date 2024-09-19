package Vio.test;

import java.io.File;
import java.io.FileWriter;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fileWriter = new FileWriter(file, true)) {

            fileWriter.write("Stll Stns");
            fileWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
