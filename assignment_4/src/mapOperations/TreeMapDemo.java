package mapOperations;

import java.util.*;

public class TreeMapDemo {
    public void demoMapOperations() {
        Map<String, String> treeMap = new TreeMap<>();
        CollectionOperations.addEntries(treeMap, "Arun", "A", "Bala", "B", "Charan", "C", "Deva", "D");
        CollectionOperations.updateEntry(treeMap, "Arun", "A+");
        CollectionOperations.removeEntry(treeMap, "Bala");
        CollectionOperations.iterateEntries(treeMap);
        
//        CollectionOperations.addEntry(treeMap, "Shiv", "S");
    }
}

