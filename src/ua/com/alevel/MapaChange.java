package ua.com.alevel;

import java.util.*;
import java.util.List;

public class MapaChange {
    public static void replaceKeyValue(Map<String, String> map){
       List <String> key = new ArrayList<>();
       List <String> value = new ArrayList<>();

        int size = map.size();
        for (Map.Entry<String, String> data : map.entrySet()) {
            key.add(data.getKey());
            value.add(data.getValue());
        }
        map.clear();
        for (int i = 0; i < size; i++) {
            map.put(value.get(i),key.get(i));
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("one","один");
        map.put("two","два");
        map.put("three","три");
        map.put("four","четыре");
        map.put("five","пять");
        System.out.println(map);
        replaceKeyValue(map);
    }


}
