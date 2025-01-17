package factorial;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		scanner.close();
		
		if(number<0) {
			System.out.println("Factorial is not defined for negative numbers.");
		}else {
			System.out.println("Factorial of " + number + " (using recursion) is" + " " + factorialRecursion(number));
		}
	}
	
	public static int factorialRecursion (int n) {
		if (n==0 || n==1) {
			return 1;
		}else {
			return n * factorialRecursion (n-1);
		}
		
	}
	
}
