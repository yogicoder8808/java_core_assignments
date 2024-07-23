package iterator_listIteratorDemo;

import java.util.*;

public class CustomList {
    private ArrayList<Integer> list;

    public CustomList() {
        list = new ArrayList<>();
    }

    // Method to add elements
    public void addElement(Integer element) {
        list.add(element);
    }

    // Method to remove elements
    public void removeElement(Integer element) {
        list.remove(element);
    }

    // Method to traverse using Iterator
    public void traverseUsingIterator() {
        System.out.println("Traversing using Iterator:");
        Iterator<Integer> iterator = list.iterator();
        // Forward traversal
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();
        
    }
    	
    

    // Method to traverse using ListIterator
    public void traverseUsingListIterator() {
        System.out.println("Traversing using ListIterator:");
        ListIterator<Integer> listIterator = list.listIterator();
        
        // Forward traversal
        while (listIterator.hasNext()) {
            Integer element = listIterator.next();
            System.out.print(element + " ");
        }
        System.out.println();
        
        // Backward traversal
        System.out.println("Traversing backward using ListIterator:");
        while (listIterator.hasPrevious()) {
            Integer element = listIterator.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Method to print the list
    public void printList() {
        System.out.println("Current list: " + list);
    }
}
