package mapOperations;

import java.util.*;

public class LinkedHashMapDemo {
    public void demoMapOperations() {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        CollectionOperations.addEntries(linkedHashMap, "Arun", "A", "Bala", "B", "Charan", "C", "Deva", "D");
        CollectionOperations.updateEntry(linkedHashMap, "Arun", "A+");
        CollectionOperations.removeEntry(linkedHashMap, "Bala");
        CollectionOperations.iterateEntries(linkedHashMap);
        
//        CollectionOperations.addEntry(linkedHashMap, "Shiv", "S");
    }
}


