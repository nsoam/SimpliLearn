//Covers Section 2.17 - Regular Expressions

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsEx {
    public static void main(String[] args) {
        Regex_Test regex_test = new Regex_Test();
        regex_test.regexChecker("nice");
    }
}

class Regex_Test {
    public void regexChecker(String Regex_Pattern) {
        Scanner input = new Scanner(System.in);
        String testString = input.nextLine();
        Pattern pattern = Pattern.compile(Regex_Pattern);
        Matcher matcher = pattern.matcher(testString);
//        System.out.println("This is test string: "+ testString);
//        System.out.println("Regex pattern: "+ Regex_Pattern);
        int count = 0;
        while (matcher.find()) {
            count += 1;
        }
        System.out.format("Number of matches found: %d ", count);
    }
}