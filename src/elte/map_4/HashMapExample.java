package elte.map_4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void hashMapPutGet() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Key", 1);
        map.put("Key", 2);

        Integer value = map.get("Key");

        assert value == 2;
    }

    public static void hashMapReplace() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Key", 1);
        //Only replaces key if it is present!
        map.replace("Key", 2);

        Integer value = map.get("Key");

        assert value == 2;
    }

    public static void hashMapPutAll() {
        Map<String, Integer> mapToAdd = new HashMap<>();
        mapToAdd.put("Key", 1);
        mapToAdd.put("Key2", 1);

        Map<String, Integer> map = new HashMap<>();
        map.putAll(mapToAdd);
    }

    public static void hashMapRemove() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Key", 1);

        Integer value = map.remove("Key");

        assert value == 1;
    }

    public static void hashMapContains() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Key", 1);

        boolean containsKey = map.containsKey("Key");
        boolean containsValue = map.containsValue(1);
    }

    public static void hashMapKeySet() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Key", 1);

        Set<String> keys = map.keySet();
    }

    public static void hashMapValues() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Key", 1);

        Collection<Integer> keys = map.values();
    }
}
