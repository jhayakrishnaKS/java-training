package I_collections;

import java.util.HashMap;
import java.util.Map;

public class I_Map {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"hey");
        map.put(2,"hello");
        map.put(3,"sup!!");
        map.replace(3,"wassup");
        System.out.println(map);
    }
}
