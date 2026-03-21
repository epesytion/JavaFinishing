package f_HashMap;

import java.awt.image.Kernel;
import java.util.HashMap;

public class Main {
    static void main(String[] args) {
        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();
        map.put("Apple", 0.50);
        map.put("Banana", 0.75);
        map.put("Orange", 0.25);
        System.out.println(map);

        //If you add another element with the same key, you'll override it
        //Let's say our apple is risen in price
        map.put("Apple", 0.80);
        System.out.println(map);

        // Other methods
        // map.remove("Apple");
//        System.out.println(map.containsKey("Apple"));
//        System.out.println(map.containsValue(0.25));
//        System.out.println(map.get("Apple")); //Accesses value of key
//        System.out.println(map.size());
//        System.out.println(map.keySet()); //set of keys


        //FORMATTING
        System.out.println("Products: ");
        for(String key : map.keySet()) {
            System.out.println(key + " : $" + map.get(key));
        }
    }
}
