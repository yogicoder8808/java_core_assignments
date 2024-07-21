package unique_elements;

import java.util.ArrayList;
import java.util.List;

public class UniqueElementsFinder {
	
    private String[] array;
    
    public UniqueElementsFinder(String[] array) {
        this.array = array;
    }

    public List<String> findUniqueElements() {
        List<String> uniqueList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            
            for (String uniqueElement : uniqueList) {
                if (array[i].equals(uniqueElement)) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                uniqueList.add(array[i]);
            }
        }

        return uniqueList;
    }

	public static void main(String[] args) {

        String[] inputArray = {"apple", "banana", "apple", "watermelon", "grapes", "grapes"};
        
        UniqueElementsFinder finder = new UniqueElementsFinder(inputArray);
        
        List<String> uniqueElements = finder.findUniqueElements();
        System.out.println("Unique elements: " + uniqueElements);
    }

}
