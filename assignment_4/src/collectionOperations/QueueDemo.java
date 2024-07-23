package collectionOperations;

import java.util.PriorityQueue;
import java.util.Queue;

class QueueDemo {

    public static void performPriorityQueueOperations() {
        Queue<String> priorityQueue = new PriorityQueue<>();
        CollectionOperations.addElement(priorityQueue, "Task 1");
        CollectionOperations.addElement(priorityQueue, "Task 2");
        CollectionOperations.addElement(priorityQueue, "Task 3");
        CollectionOperations.addElement(priorityQueue, "Task 3");
        
        CollectionOperations.removeElement(priorityQueue, "Task 3");

        CollectionOperations.pollElement(priorityQueue);

        CollectionOperations.iterateElements(priorityQueue);
    }
}

