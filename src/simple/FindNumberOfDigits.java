package simple;

import java.util.Scanner;

public class FindNumberOfDigits {

	// Iterative soln

	void iterativeSol(long number) {
		int count = 0;
		while (number != 0) {
			number = number / 10;
			++count;

		}
		System.out.println("The number of digits is given number is : " + count);
	}

	// Recursive solution to find the digit in a given number.
	int recursiveSol(long number) {
		if (number == 0)
			return 0;
		return 1 + recursiveSol(number / 10);

	}
	
	//Logarithmic solution
	
	int logarithmicSol(long number)
	{
		return (int) (Math.log10(number)+1);
	}

	public static void main(String[] args) {
		long number = 0;
		int recursiveCount = 0;
		int logarithimicCount=0;
		FindNumberOfDigits digits = new FindNumberOfDigits();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose digits using iterative method are ");
		number = sc.nextLong();
		try {

			digits.iterativeSol(number);
			recursiveCount = digits.recursiveSol(number);
			System.out.println("The number of digits using recursive method are : " + recursiveCount);
			logarithimicCount=digits.logarithmicSol(number);
			System.out.println("The number of digits using log method are : " + logarithimicCount);
		} catch (Exception e) {
			System.out.println("Input is not proper");
		}

	}

}
