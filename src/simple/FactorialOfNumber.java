/**
 * 
 */
package simple;

import java.util.Scanner;

/**
 * @author Ayush This program will compute the factorial of a number.
 *
 */
public class FactorialOfNumber {

	void usingIterativeSol(long number) {
		int result = 1;
		for (int i = 2; i <= number; i++) {
			result = result * i;
		}
		System.out.println("The factorial of " + number + " is " + result +".Thank you!");
		
		
	}
	int usingRecursiveSol(long number){
		
		if(number == 0)
			return 1;
		return (int) (number * usingRecursiveSol(number-1));
		
	}

	public static void main(String[] args) {
		long number = 0;
		int result=0;
		FactorialOfNumber factorial = new FactorialOfNumber();
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the number whose factorial is required: ");
			number = sc.nextLong();

			factorial.usingIterativeSol(number);
			result=factorial.usingRecursiveSol(number);
			System.out.println("The factorial of " + number+ " is "+result +".") ;
		} catch (Exception e) {
			System.out.println("Please provide the correct input");
		}

	}
}
