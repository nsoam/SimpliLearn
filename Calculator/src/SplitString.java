public class SplitString {
    public static void main(String[] args) {
        String s1 = "java string split method sample";
//                "hi there!, how have you been ?";
        System.out.println(s1);
        String[] s1Arr = s1.split("\\s");
        for(String str:s1Arr) {
            System.out.println(str);
        }
    }

}

