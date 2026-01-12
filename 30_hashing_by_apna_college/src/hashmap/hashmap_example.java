package hashmap;

import java.security.Key;
import java.util.HashMap;
import java.util.*;

public class hashmap_example {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
//        insertion
        map.put("Hari om" , 99);
        map.put("adish" , 99);
        map.put("hardik" , 101);
        map.put("Harsh" , 900);

//        search
        System.out.println(map.containsKey("Hari om"));
        System.out.println(map.containsValue(99));
        System.out.println(map.get("Hari om"));

//        interation (1)
        for( Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey() + " " );
            System.out.println(e.getValue());
        }

//        iteration (2)
        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key + " " + map.get(key));
        }

//        System.out.println(map);
    }
}
