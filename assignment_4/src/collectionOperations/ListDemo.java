package collectionOperations;

//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
import java.util.*;

class ListDemo {

    public static void performArrayListOperations() {
        List<String> arrayList = new ArrayList<>();
        CollectionOperations.addElement(arrayList, "Apple");
        CollectionOperations.addElement(arrayList, "Banana");
        CollectionOperations.addElement(arrayList, "Cherry");
        CollectionOperations.addElement(arrayList, "Apple"); // Duplicates are allowed

        CollectionOperations.removeElement(arrayList, "Banana");

        CollectionOperations.iterateElements(arrayList);
    }

    public static void performLinkedListOperations() {
        List<String> linkedList = new LinkedList<>();
        CollectionOperations.addElement(linkedList, "Dog");
        CollectionOperations.addElement(linkedList, "Cat");
        CollectionOperations.addElement(linkedList, "Bird");
        CollectionOperations.addElement(linkedList, "Dog"); // Duplicates are allowed

        CollectionOperations.removeElement(linkedList, "Cat");

        CollectionOperations.iterateElements(linkedList);
    }
}

