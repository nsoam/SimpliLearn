package com.lockedme;

import java.io.File;
import java.io.FilenameFilter;

public class FileSearch implements FilenameFilter {
    String initials;

    // constructor to initialize object
    public FileSearch(String initials) {
        this.initials = initials;
    }

    // overriding the accept method of FilenameFilter interface
    public boolean accept(File dir, String name) {
        return name.startsWith(initials);
    }


    public void searchFile(String path, String name) {
        // Create an object of the File class. Replace the file path with path of the directory
        String absPath = path + "\\";
        File directory = new File(absPath);

        // Create an object of Class MyFilenameFilter. Constructor with name of file which is being searched
        FilenameFilter filter1 = new FileSearch(name);

        // store all names with same name with/without extension
        String[] flist = directory.list(filter1);
        // Empty array
        if (flist != null && flist.length > 0) {
            // Print all files with same name in directory as provided in object of MyFilenameFilter class
            System.out.println("Files Found:");
            for (String file : flist) {
                System.out.println(file);
            }
        } else {
            System.out.println("No such file found");
        }
    }
}
