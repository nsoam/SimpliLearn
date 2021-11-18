import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        EmailChecker emailChecker = new EmailChecker();
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide the email you are looking for:");
        String email = input.next();

        String result = emailChecker.checker(email);
        System.out.println(result);
    }
}

class EmailChecker {
    public String checker(String email) {

        ArrayList<String> emails = new ArrayList<>();
        emails.add("abc@gmail.com");
        emails.add("def@gmail.com");
        emails.add("ghi@gmail.com");
        emails.add("jkl@gmail.com");
        emails.add("xyz@gmail.com");
        Pattern pattern = Pattern.compile(email);

//        check if email is found in emails
        for (String em : emails) {
            Matcher matcher = pattern.matcher(em);
            if (matcher.matches()) {
                return ("Email found in list");
            }
        }
        return ("Email not found");
    }
}
