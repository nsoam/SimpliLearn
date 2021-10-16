import java.util.InputMismatchException;
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int x = input.nextInt();
            int y = input.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println(inputMismatchException.getClass().getName());
        } catch (ArithmeticException aex) {
            System.out.println(aex.getClass().getName() + ": / by zero");
        }
    }
}
