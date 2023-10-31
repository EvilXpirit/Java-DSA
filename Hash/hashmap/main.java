package Hash.hashmap;

import java.util.*;
//import java.lang.*;

public class main {
    public static void main(String[] args) {
        //HashMap<String, Integer> map = new HashMap<>();
        Hashmap.HashMap<String, Integer> map = new Hashmap.HashMap<>();
        map.put("Aditya", 10);
        map.put("Naruto", 8);
        map.put("Onizuka", 99);
//        map.put()

        ArrayList<String> keys = map.keySet();
        for(int i = 0; i<keys.size(); i++){
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }
    }
}
