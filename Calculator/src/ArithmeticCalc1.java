import java.util.Scanner;

public class ArithmeticCalc1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Please enter 2 numbers:");
        double add, sub, div, mul, input1, input2;
        input1 = n.nextDouble();
        input2 = n.nextDouble();

        System.out.println("Please choose the operation to perform on the above 2 numbers: +, -, /, *");
        String operation = n.next();

        switch (operation) {
            case "+":
                add = input1 + input2;
                System.out.println("Addition of above 2 numbers:" + add);
                break;
            case "-":
                sub = input1 - input2;
                System.out.println("Subtraction of above 2 numbers:" + sub);
                break;
            case "/":
                div = input1 / input2;
                System.out.println("Division of above 2 numbers:" + div);
                break;
            case "*":
                mul = input1 * input2;
                System.out.println("Multiplication of above 2 numbers:" + mul);
                break;
            default:
                System.out.println("Invalid operation selected" + operation);
                break;
        }
    }
}

