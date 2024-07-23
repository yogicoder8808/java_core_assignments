package collectionOperations;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class SetDemo {

    public static void performHashSetOperations() {
        Set<String> hashSet = new HashSet<>();
        CollectionOperations.addElement(hashSet, "Red");
        CollectionOperations.addElement(hashSet, "Blue");
        CollectionOperations.addElement(hashSet, "Green");
        CollectionOperations.addElement(hashSet, "Red"); // Duplicates are not allowed

        CollectionOperations.removeElement(hashSet, "Blue");

        CollectionOperations.iterateElements(hashSet);
    }

    public static void performTreeSetOperations() {
        Set<String> treeSet = new TreeSet<>();
        CollectionOperations.addElement(treeSet, "Pineapple");
        CollectionOperations.addElement(treeSet, "Mango");
        CollectionOperations.addElement(treeSet, "Peach");
        CollectionOperations.addElement(treeSet, "Mango"); // Duplicates are not allowed

        CollectionOperations.removeElement(treeSet, "Peach");

        CollectionOperations.iterateElements(treeSet);
    }
}

