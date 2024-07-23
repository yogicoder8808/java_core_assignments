package collectionOperations;

import java.util.Collection;
import java.util.Queue;

class CollectionOperations {

    public static <T> void addElement(Collection<T> collection, T element) {
        collection.add(element);
        System.out.println("Added element: " + element);
        System.out.println(collection.getClass().getSimpleName() + ": " + collection);
    }

    public static <T> void removeElement(Collection<T> collection, T element) {
        collection.remove(element);
        System.out.println("Removed element: " + element);
        System.out.println(collection.getClass().getSimpleName() + ": " + collection);
    }

    public static <T> void iterateElements(Collection<T> collection) {
        System.out.println("Iterating over " + collection.getClass().getSimpleName() + ":");
        for (T item : collection) {
            System.out.println(item);
        }
    }

    public static <T> void pollElement(Queue<T> queue) {
        T element = queue.poll();
        System.out.println("Polled element: " + element);
        System.out.println(queue.getClass().getSimpleName() + ": " + queue);
    }
}

