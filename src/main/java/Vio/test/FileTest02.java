package Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
         File fileDirectory = new File("newFolder");
         boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println(isDirectoryCreated);
        File fileToDirectory = new File(fileDirectory, "newF.txt");
        try {
            boolean isFileCreated = fileToDirectory.createNewFile();
            System.out.println(isFileCreated);

            File fileRenamed = new File(fileDirectory,"newFileName.txt");
            boolean isRenamed = fileToDirectory.renameTo(fileRenamed);
            System.out.println(isRenamed);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
