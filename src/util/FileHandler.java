package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileHandler {
    private String directory;
    private String fileName;
    private Path directoryPath;
    private Path filePath;

    public String getDirectory() {
        return directory;
    }

    public String getFileName() {
        return fileName;
    }

    public FileHandler(String directory, String fileName){
        this.directory = directory;
        this.fileName = fileName;

        this.directoryPath = Paths.get(directory);
        this.createDirectoryIfNotExist();

        this.filePath = Paths.get(directory, fileName);
        this.createFileIfNotExist();

    }

    private boolean createFileIfNotExist(){
        try {
            if(!Files.exists(this.filePath)){
                Files.createFile(this.filePath);
            }
        } catch(IOException e){
            return false;

        }
        return true;
    }

    private boolean createDirectoryIfNotExist(){
        try {
            if(!Files.exists(this.directoryPath)){
                Files.createDirectory(this.directoryPath);
            }
        } catch(IOException e){
            return false;
        }
        return true;
    }

    public List<String> retrieveFileContents(){
        try {
            List<String> contents = Files.readAllLines(filePath);
            return contents;
        } catch(IOException e) {
            return null;
        }
    }

    public boolean writeToFile(List contents){
        try{
            Files.write(Paths.get(directory, fileName), contents);
        } catch(IOException e){
            return false;
        }
        return true;
    }

}
//        1. Create a method to create the file if it does not exist.
//        2. Create a method to create the directory if it does not exist.
//        3. Create a method for retrieving file contents as a List of Strings.
//        4. Create a method to write (append) new contents to a file. This method could have an optional parameter to choose between appending the contents of the file or not.