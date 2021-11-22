package com.lockedme;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileOperations {
    public void fileOps(String path, int option, String name) throws IOException {
        VirtualKeyProj goback= new VirtualKeyProj();
        Scanner scanner = new Scanner(System.in);
        String absPath = path + "\\" + name;
        FileSearch fileSearch = new FileSearch(name);

        switch (option) {
//            To Create or Override a file in current directory
            case 1:
                System.out.println("Please type in the content of the file:");
                String content = scanner.nextLine();
                System.out.println("Creating file " + absPath + " ...");
                Files.write(Paths.get(absPath), content.getBytes(StandardCharsets.UTF_8));
                System.out.println("File Created: " + absPath);
                break;
//            To Delete a file
            case 2:
                boolean delResult = Files.deleteIfExists(Paths.get(absPath));
                if (delResult) {
                    System.out.println("Deleting file");
                } else {
                    System.out.println("Sorry, unable to delete the file. Please check if file exists");
                }
                break;
//            To Search a file
            case 3:
                fileSearch.searchFile(path, name);
                break;
            default:
                System.out.println("Please select a valid option");
        }
    }
}
