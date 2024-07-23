package mapOperations;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public void demoMapOperations() {
        Map<String, String> hashMap = new HashMap<>();
        CollectionOperations.addEntries(hashMap, "Arun", "A", "Bala", "B", "Charan", "C", "Deva", "D");
        CollectionOperations.updateEntry(hashMap, "Arun", "A+"); 
        CollectionOperations.removeEntry(hashMap, "Bala");
        CollectionOperations.iterateEntries(hashMap);
        
//        CollectionOperations.addEntry(hashMap, "Balu", "B");
    }
}

