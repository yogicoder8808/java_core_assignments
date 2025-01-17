package factorial;

import java.util.Scanner;

public class FactorialIterative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		scanner.close();
		
		if (number <0) {
			System.out.println("Factorial is not defined for negative numbers.");
		}else {
			System.out.println("Factorial of " + number + " (using iteration) is " + factorialIterative(number));
		}
	}
	
	public static int factorialIterative (int n) {
		int result = 1;
		for (int i=1; i<=n; i++) {
			result *=i;
		}
		return result;
	}

}
