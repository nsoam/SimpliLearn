import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashMapEx {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int mapSize = input.nextInt();
        System.out.println("mapSize="+mapSize);
        HashMap<String, Integer> hMap = new HashMap<>();
        String name;
        int phone=0;

        for(int i=0; i<=mapSize;i++){
            name = input.nextLine();
            System.out.println("name="+name);
            phone = input.nextInt();
            System.out.println("phone="+phone);
//            hMap.put(name,phone);
            input.nextLine();
        }

/*        while(input.hasNext())
        {
            String s=input.nextLine();
        }

        for(Map.Entry<String, Integer> hmElement: hMap.entrySet()){
            if(hmElement.getValue()!=0){
                System.out.println(hmElement.getKey()+"="+hmElement.getValue());
            }
            else {
                System.out.println("Not found");
            }
        }*/


    }

}
