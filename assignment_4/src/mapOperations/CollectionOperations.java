package mapOperations;

import java.util.Map;

public class CollectionOperations{

    // Method to add multiple entries to the map
    public static <K, V> void addEntries(Map<K, V> map, K key1, V value1, K key2, V value2, K key3, V value3, K key4, V value4) {
    	map.put(key1, value1);
        map.put(key2, value2);
        map.put(key3, value3);
        map.put(key4, value4);
        System.out.println("Entries after adding: " + map);
    }

    public static <K, V> void addEntry(Map<K, V> map, K key, V value) {
        map.put(key, value);
        System.out.println("Added entry: Key = " + key + ", Value = " + value);
        System.out.println(map.getClass().getSimpleName() + ": " + map);
    }

    public static <K, V> void updateEntry(Map<K, V> map, K key, V value) {
        map.put(key, value);
        System.out.println("Entries after updating " + key + "'s value: " + map);
    }

    public static <K, V> void removeEntry(Map<K, V> map, K key) {
        map.remove(key);
        System.out.println("Entries after removing " + key + ": " + map);
    }

    public static <K, V> void iterateEntries(Map<K, V> map) {
        System.out.println("Iterating over entries:");
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

