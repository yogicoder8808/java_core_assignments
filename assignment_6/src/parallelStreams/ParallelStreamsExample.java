package parallelStreams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamsExample {
    public static void main(String[] args) {
       
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        int sumOfSquares = numbers.parallelStream().mapToInt(n -> n * n).sum();
        System.out.println("Sum of squares: " + sumOfSquares);
    }
}
