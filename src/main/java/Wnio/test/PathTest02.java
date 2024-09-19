package Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) {


       try {
           // create folder
           Path folderPath = Paths.get("newFolder");
           if(Files.notExists(folderPath)) {
               Path pathDirectory = Files.createDirectory(folderPath);
          }
           // create sub folder
           Path subPath = Paths.get("newFolder/subPath/subPathFolder");
           Path subDirectory = Files.createDirectories(subPath);

           // create files inside the folder
           Path filePath = Paths.get(subPath.toString(), "file.txt");
           if(Files.notExists(filePath)){
               Path fileFileCreated = Files.createFile(filePath);
           }

           // copy file
           Path source = filePath;
           Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
           Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

       } catch (IOException ex){
           ex.printStackTrace();
       }
    }
}
