package Hash.hashmap;

import java.util.*;
//import java.lang.*;

public class main {
    public static void main(String[] args) {
        //HashMap<String, Integer> map = new HashMap<>();
        Hashmap.HashMap<String, Integer> map = new Hashmap.HashMap<>();
        map.put("Naruto", 10);
        map.put("Sakura", 8);
        map.put("Sasuke", 99);
        map.put("Kakashi", 7);
        map.remove("Sakura");

        ArrayList<String> keys = map.keySet();
        for(int i = 0; i<keys.size(); i++){
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }

        System.out.println(map.containsKey("Naruto"));
    }
}
