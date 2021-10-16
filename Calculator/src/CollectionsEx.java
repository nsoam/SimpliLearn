import java.util.*;

public class CollectionsEx {
    public static void main(String[] args) {

/*set*/
//    Hashset
        HashSet<String> flowers= new HashSet();
        flowers.add("Rose");
        flowers.add("Daisy");
        flowers.add("Hibiscus");
        flowers.add("Marigold");
        flowers.add("Hibiscus");

        Iterator hsIterator = flowers.iterator();
        System.out.println("This is Hashset:");
        while(hsIterator.hasNext()){
            System.out.println(hsIterator.next());
        }

        flowers.hashCode();

//    Treeset
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(flowers);

        Iterator tsIterator = treeSet.iterator();
        System.out.println("\nThis is Treeset:");
        while(tsIterator.hasNext()){
            System.out.println(tsIterator.next());
        }

//    LinkedHashset
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(flowers);
        linkedHashSet.add("Lavender");
        linkedHashSet.add("Catmint");

        Iterator lhsIterator = linkedHashSet.iterator();
        System.out.println("\nThis is LinkedHashset:");
        while(lhsIterator.hasNext()){
            System.out.println(lhsIterator.next());
        }

/*list*/
//    Vector
        Vector vector = new Vector();
        vector.add(1);
        vector.add("dog");
        vector.add(5.25);
        int size = vector.size();

        System.out.println("\nThis is a Vector of size:"+ size);
        for (int i=0; i<size;i++){
            System.out.println(vector.get(i));
        }

//    ArrayList
        List colors = new ArrayList<String>();
        colors.add("blue");
        colors.add("red");
        colors.add("green");

        Iterator alIterator= colors.iterator();

        System.out.println("\nThis is Arraylist:");
        while(alIterator.hasNext()){
            System.out.println(alIterator.next());
        }

//    LinkedList
        List days = new LinkedList();
        days.add("Mon");
        days.add("Tues");
        days.add("Wed");
        days.add("Thurs");
        days.add("Fri");
        days.add("Sat");

        Iterator llIterator= days.iterator();

        System.out.println("\nThis is Linkedlist:");
        while(llIterator.hasNext()){
            System.out.println(llIterator.next());
        }
        System.out.println("Adding Sunday at the start of the LinkedList:");
        days.add(0,"Sun");
        days.remove("Thurs");
        days.remove("Fri");
        days.remove("Sat");
        Iterator llIterator1= days.iterator();
        while(llIterator1.hasNext()){
            System.out.println(llIterator1.next());
        }

/*map*/
//    Hashmap
        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(0,"Java");
        hashMap.put(1,"Python");
        hashMap.put(2,"Kotlin");

        System.out.println("\nThis is Hashmap:");
        System.out.println("Size of hashMap: " + hashMap.size());
        System.out.println("Key value pairs: " + hashMap.entrySet());
        System.out.println("Value for key = 0: " + hashMap.get(0));

        for(Map.Entry<Integer, String> hmElement: hashMap.entrySet()){
            System.out.println(hmElement.getKey() + " " + hmElement.getValue());
        }

//    Treemap
        TreeMap<Integer, String> treeMap = new TreeMap();
        treeMap.put(10, "Hi");
        treeMap.put(15, "Hello");
        treeMap.put(20, "Halo");
        treeMap.put(30, "Jello");

        System.out.println("\nThis is TreeMap:");
        System.out.println("Size of TreeMap: " + treeMap.size());
        System.out.println("Key value pairs: " + treeMap.entrySet());
        System.out.println("Value for key = 10: " + treeMap.get(10));

        for(Map.Entry<Integer, String> tmElement: treeMap.entrySet()){
            System.out.println(tmElement.getKey() + " " + tmElement.getValue());
        }

//    LinkedHashmap
        LinkedHashMap<Integer, String> linkedHashmap = new LinkedHashMap<>();
        linkedHashmap.put(100, "Buenos");
        linkedHashmap.put(150, "Dias");
        linkedHashmap.put(200, "Buenos");
        linkedHashmap.put(300, "Noches");

        System.out.println("\nThis is LinkedHashMap:");
        System.out.println("Size of TreeMap: " + linkedHashmap.size());
        System.out.println("Key value pairs: " + linkedHashmap.entrySet());
        System.out.println("Value for key = 100: " + linkedHashmap.get(100));

        for(Map.Entry<Integer, String> lhmElement: linkedHashmap.entrySet()){
            System.out.println(lhmElement.getKey() + " " + lhmElement.getValue());
        }
    }
}
