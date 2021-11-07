//Covers Section 2.3 - Methods
import java.util.Scanner;

public class MethodEx {
    public int add(int a, int b) {
        int c = a+b;
        System.out.println("a+b= "+ c);
        return c;
    }

    public int sub(int a, int b) {
        int c = a-b;
        System.out.println("a-b= "+ c);
        return c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        MethodEx methodEx = new MethodEx();
        System.out.println("a= "+ a);
        System.out.println("b= "+ b);
        methodEx.add(a,b);
        methodEx.sub(a,b);
    }
}
