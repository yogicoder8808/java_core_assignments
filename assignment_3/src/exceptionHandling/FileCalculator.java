package exceptionHandling;
import java.io.*;
import java.util.*;

public class FileCalculator {

	public static void main(String[] args) {
String fileName = "numbers.txt";
        
        List<Integer> numbers = new ArrayList<>();
        
        // Read numbers from file
        try {
            numbers = readNumbersFromFile(fileName);
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found: " + fileName);
            return;
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        } catch (NumberFormatException e) {
            System.err.println("Error: File contains non-numeric data.");
            return;
        }
        
        // Perform calculations and display results
        try {
            displayResults(numbers);
        } catch (ArithmeticException e) {
            System.err.println("Error performing calculations: " + e.getMessage());
        }
    }

    private static List<Integer> readNumbersFromFile(String fileName) throws IOException, NumberFormatException {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                numbers.add(Integer.parseInt(line.trim()));
            }
        }
        return numbers;
    }

    private static void displayResults(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new ArithmeticException("No numbers to calculate.");
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            sum += number;
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        double average = sum / (double) numbers.size();

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
       

	}

}
