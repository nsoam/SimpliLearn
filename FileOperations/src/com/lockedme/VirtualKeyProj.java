/* VirtualKeyProj Application should have:
 1. A welcome screen showing application name and the developer details.

 2. UI displaying following user interactive options:
     •	1st  option should return the current file names in ascending order. The root directory can be either empty or contain few files or folders in it
     •	2nd option should return the details of the user interface such as options displaying the following:
             o	Add a file to the existing directory list -	You can ignore the case sensitivity of the file names
             o	Delete a user specified file from the existing directory list - You can add the case sensitivity on the file name in order to ensure that the right file is deleted from the directory list
                 	Return a message if FNF (File not found)
             o	Search a user specified file from the main directory
                 	You can add the case sensitivity on the file name to retrieve the correct file
                 	Display the result upon successful operation
                 	Display the result upon unsuccessful operation
             o	Option to navigate back to the main context
     •	3rd option to close the application

 3. Features to accept the user input to select one of the options listed */

package com.lockedme;

import java.io.IOException;
import java.util.Scanner;

public class VirtualKeyProj {
    public static void mainMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select the operation to perform from below options:");
        System.out.println("Choose 1 : To enlist the files/folders in current directory");
        System.out.println("Choose 2 : To Add/Delete/Search a file");
        System.out.println("Choose 3 : To Exit");

        int options1 = scanner.nextInt();
        FileList fileList = new FileList();
        FileOperations fileOperations = new FileOperations();
        scanner.nextLine();
        String dirLocation;

        switch (options1) {
            case 1:
                System.out.println("Please provide a directory to scan:");
                dirLocation = scanner.nextLine() + "\\";
                fileList.listFiles(dirLocation);
                welcomePage();
            case 2:
                dirOperations(scanner, fileOperations);
            case 3:
//              Implement option 3
                System.out.println("Exiting application...");
                System.exit(0);
            default:
                System.out.println("Please provide a valid option");
        }
    }

    private static void dirOperations(Scanner scanner, FileOperations fileOperations) {
        String dirLocation;//Implement option 2
        System.out.println("\nPlease provide a directory to scan:");
        dirLocation = scanner.nextLine();
        System.out.println("Please select an option to perform an operation on a file\n");
        System.out.println("Choose 1 : To Create or Override a file in current directory");
        System.out.println("Choose 2 : To Delete a file");
        System.out.println("Choose 3 : To Search a file");
        System.out.println("Choose 4 : To Return to previous option menu");
        int options2 = scanner.nextInt();
        scanner.nextLine();
//      To Return to previous option menu
        if (options2 == 4) {
            mainMenu();
        } else {
            System.out.println("Please type in the name of the file");
            String name = scanner.nextLine();
            System.out.println("File name chosen: " + name);
            try {
                fileOperations.fileOps(dirLocation, options2, name);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            dirOperations(scanner, fileOperations);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        welcomePage();
        Thread.currentThread().join();
    }

    private static void welcomePage() {
        System.out.println("/************************************/");
        System.out.println("\nWelcome to File Operations Application!!");
        System.out.println("Developed by - Neha\n");
        System.out.println("/************************************/");
        mainMenu();
    }
}
