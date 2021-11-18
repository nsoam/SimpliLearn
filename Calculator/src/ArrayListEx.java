//Covers Section 2.15 - Arrays

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> strArr = new ArrayList<>();
        strArr.add("JJ");
        strArr.add("Tomtom");
        strArr.add("Yoyo");
        strArr.add("Mama");
        strArr.add("Baba");
        Iterator iterator = strArr.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
