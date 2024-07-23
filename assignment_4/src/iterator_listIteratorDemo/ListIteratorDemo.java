package iterator_listIteratorDemo;

public class ListIteratorDemo {

	public static void main(String[] args) {
CustomList customList = new CustomList();
        
        // Adding elements
        customList.addElement(10);
        customList.addElement(20);
        customList.addElement(30);
        customList.addElement(40);
        customList.addElement(50);
        
        // Print current list
        customList.printList();
        
        // Traverse using Iterator
        customList.traverseUsingIterator();
        
        // Traverse using ListIterator
        customList.traverseUsingListIterator();
        
        // Removing an element
        customList.removeElement(30);
        
        // Print updated list
        customList.printList();
        
        // Traverse again after removal using Iterator
        customList.traverseUsingIterator();
        
        // Traverse again after removal using ListIterator
        customList.traverseUsingListIterator();

	}

}
