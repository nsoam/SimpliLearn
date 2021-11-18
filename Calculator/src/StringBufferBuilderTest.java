//Covers Section 2.13 - Strings

public class StringBufferBuilderTest {
    public static void main(String[] args) {
        System.out.println("This is StringBuffer Example:");
        StringBuffer stringBuffer = new StringBuffer("Able was I ere I saw Elba.");
        System.out.println(stringBuffer);
//        System.out.println("Above stringbuffer's length: = " + stringBuffer.length());
        stringBuffer.append(" Why??");
        System.out.println(stringBuffer);

        System.out.println("\nThis is String Example:");
        String hannah = "Did Hannah see bees? Hannah did.";
        System.out.println("Value of String hannah = " + hannah);
//        System.out.println("Above string's length: = " + hannah.length());
//        System.out.println("hannah.charAt(12) - "+hannah.charAt(12));
//        System.out.println("hannah.charAt(2) - "+hannah.charAt(2));
//        System.out.println("b is at: "+ hannah.indexOf("b"));

        String test = "Was it a car or a cat I saw?";
        System.out.println("Value of String test = " + test);
//        System.out.println(test.substring(9, 12));

        hannah = hannah + " " + test;
        System.out.println("Value of String hannah = " + hannah);

        System.out.println("\nThis is StringBuilder Example:");
        StringBuilder stringBuilder = new StringBuilder("I guess I know what I am doing");
        System.out.println(stringBuilder);
        stringBuilder.append("...well, lets see!");
        System.out.println(stringBuilder);
    }
}
