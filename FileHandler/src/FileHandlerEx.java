/*
        3.7.2 Writing a program in Java to create a file
        3.7.3 Writing a program in Java to read a file
        3.7.4 Writing a program in Java to update a file
        3.7.5 Writing a program in Java to delete a file
*/

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileHandlerEx {
    private static final String NEW_LINE = System.lineSeparator();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in the name of the file");
        String name = scanner.nextLine();
        System.out.println("File name chosen: " + name);
        String content;
        int option ;

        File file = new File(name);
        if (file.exists()) {
            System.out.println("File Found! \nTo update an existing file please type in the content of the file now else hit enter and then choose an option from the following list:");
            content = NEW_LINE + scanner.nextLine();

            System.out.println("Options List:");
            System.out.println("Choose 1 : To Create or Override a file");
            System.out.println("Choose 2 : To Read a file");
            System.out.println("Choose 3 : To Update/Append a file");
            System.out.println("Choose 4 : To Delete a file");
            option = scanner.nextInt();
        } else {
            System.out.println("File doesn't exist! \nTo create a file please type in the content of the file and in next line enter 1 to create the file else enter 0 to exit");
            content = scanner.nextLine();
            int userInp = scanner.nextInt();
            if (userInp == 1) {
                content = scanner.nextLine();
                option = userInp;
            }
            else{
                option = userInp;
            }
        }

        switch (option) {
//            3.7.2 Writing a program in Java to create a file
            case 0:
                System.out.println("Exiting...");
                break;
            case 1:
                System.out.println("Creating file " + name + " ...");
                Files.write(Paths.get(name), content.getBytes(StandardCharsets.UTF_8));
                System.out.println("File Created: " + name);
                break;
//            3.7.3 Writing a program in Java to read a file
            case 2:
                Stream<String> lines = Files.lines(Paths.get(name));
                System.out.println("Reading file " + name + " ...");
                lines.forEachOrdered(System.out::println);
                break;
//            3.7.4 Writing a program in Java to update a file
            case 3:
                System.out.println("Updating file " + name + " ...");
                Files.write(Paths.get(name), content.getBytes(StandardCharsets.UTF_8),
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                break;
//            3.7.5 Writing a program in Java to delete a file
            case 4:
                boolean result = Files.deleteIfExists(Paths.get(name));
                if (result) {
                    System.out.println("deleting file");
                } else {
                    System.out.println("Sorry, unable to delete the file. Please check if file exists");
                }
                break;
            default:
                System.out.println("Please select a valid option");
        }

    }
}
