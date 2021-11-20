/*
        3.7.2 Writing a program in Java to create a file
        3.7.3 Writing a program in Java to read a file
        3.7.4 Writing a program in Java to update a file
        3.7.5 Writing a program in Java to delete a file
*/

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
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

        System.out.println("To create or update a file please type in the content of the file");
        String content = NEW_LINE + scanner.nextLine();

        File file = null;
        ObjectOutputStream oos = null;

        System.out.println("Please select an option:");
        System.out.println("Choose 1 : To create a file");
        System.out.println("Choose 2 : To read a file");
        System.out.println("Choose 3 : To update a file");
        System.out.println("Choose 4 : To delete a file");

        int option = scanner.nextInt();

        switch (option) {
//            3.7.2 Writing a program in Java to create a file
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
