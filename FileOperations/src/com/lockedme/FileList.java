package com.lockedme;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileList {
    public void listFiles(String dirLocation) {
        //Implement option 1

        if (dirLocation.isEmpty()) {
            dirLocation = "";
            System.out.println("Listing all the files/folders of the current directory...");
            try {
                List<File> files = Files.list(Paths.get(dirLocation))
                        .map(Path::toFile)
                        .collect(Collectors.toList());

                files.forEach(System.out::println);
            } catch (IOException e) {
                // Error while reading the directory
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Listing all the files/folders of " + dirLocation + " directory...");
            try {
                List<File> files = Files.list(Paths.get(dirLocation))
                        .map(Path::toFile)
                        .collect(Collectors.toList());

                files.forEach(System.out::println);
            } catch (IOException e) {
                // Error while reading the directory
                System.out.println(e.getMessage());
            }
        }
    }
}
