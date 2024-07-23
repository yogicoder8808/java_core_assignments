package mapOperations;

public class MapDemo {
    public static void main(String[] args) {
        // Demonstrate operations with different Map implementations
        MapDemo.performHashMapOperations();
        MapDemo.performTreeMapOperations();
        MapDemo.performLinkedHashMapOperations();
    }

    public static void performHashMapOperations() {
        System.out.println("HashMap Operations:");
        HashMapDemo hashMapDemo = new HashMapDemo();
        hashMapDemo.demoMapOperations();
    }

    public static void performTreeMapOperations() {
        System.out.println("TreeMap Operations:");
        TreeMapDemo treeMapDemo = new TreeMapDemo();
        treeMapDemo.demoMapOperations();
    }

    public static void performLinkedHashMapOperations() {
        System.out.println("LinkedHashMap Operations:");
        LinkedHashMapDemo linkedHashMapDemo = new LinkedHashMapDemo();
        linkedHashMapDemo.demoMapOperations();
    }
}

