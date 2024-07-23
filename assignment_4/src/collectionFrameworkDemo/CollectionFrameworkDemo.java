package collectionFrameworkDemo;
import java.util.*;

public class CollectionFrameworkDemo {

	public static void main(String[] args) {
		// Demonstrate List interface
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple"); // Duplicate elements are allowed
        System.out.println("List: " + list);

        // Demonstrate Set interface
        Set<String> set = new HashSet<>();
        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add("Red"); // Duplicates are not allowed
        System.out.println("Set: " + set);

        // Demonstrate Queue interface
        Queue<String> queue = new LinkedList<>();
        queue.add("Task 1");
        queue.add("Task 2");
        queue.add("Task 3");
        System.out.println("Queue (initial): " + queue);
        System.out.println("Queue (poll): " + queue.poll()); // FIFO order
        System.out.println("Queue (after poll): " + queue);

        // Demonstrate Map interface
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);
        System.out.println("Map: " + map);
        System.out.println("Value for Alice: " + map.get("Alice"));

        // Use LinkedHashMap to maintain insertion order
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);
        System.out.println("LinkedHashMap (insertion order): " + linkedHashMap);
        System.out.println("Value for One: " + linkedHashMap.get("One"));

        // Use TreeMap to sort by keys
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 2);
        treeMap.put("Apple", 1);
        treeMap.put("Cherry", 3);
        System.out.println("TreeMap (sorted by keys): " + treeMap);
        System.out.println("Value for Banana: " + treeMap.get("Banana"));

	}

}










//List Interface:

/*ArrayList is used to create a list that allows duplicate elements and maintains insertion order.
  Operations: add, print.*/


//Set Interface:
/*HashSet is used to create a set that does not allow duplicate elements.
  Operations: add, print.*/


//Queue Interface:
/*LinkedList is used to create a queue that follows FIFO (First-In-First-Out) order.
Operations: add, poll, print.*/

//Map Interface:

//HashMap is used to create a map where keys are not ordered.
//LinkedHashMap is used to create a map that maintains insertion order of keys.
//TreeMap is used to create a map that is sorted by keys.

//Operations: put, get, print.
