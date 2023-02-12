package skillter.advanceddatastructuers;
import java.util.HashMap;

public class HashmapExample {
    

    public static void initHashmap(String key, int value) {


        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        hashMap.put(key, 2);
        System.out.println(key + " - " + hashMap.get(key));

        hashMap.put(key, value);
        System.out.println(key + " - " + hashMap.get(key)); // Displays given number because HashMap replaces the old value


        hashMap.merge(key, 1, Integer::sum);
        hashMap.merge("water bottle", 1, Integer::sum);

        System.out.println(key + " - " + hashMap.get(key));
        System.out.println("water bottle" + " - " + hashMap.get("water bottle"));
    }

}
