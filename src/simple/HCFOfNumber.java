/**
 * 
 */
package simple;

import java.util.Scanner;

/**
 * @author Ayush
 *
 */
public class HCFOfNumber {
	// euclidean algorithm.Effective way to compute HCF.
	int findHCF(int a, int b) {
		while (a != b)
			if (a > b)
				a = a - b;
			else
				b = b - a;
		return a;
	}

	// optimised way to get the hcf
	int getHCF(int a, int b) {

		if (b == 0)
			return a;
		else
			return getHCF(b, a % b);
	}

	// basic solution
	int findGCF(int a, int b) {

		int result = Math.min(a, b);
		while (result > 0) {
			if (a % result == 0 && b % result == 0) {
				break;
			}
			result--;
		}
		return result;
	}

	public static void main(String[] args) {
		int result = 0;
		int num1, num2 = 0;
		HCFOfNumber hcf = new HCFOfNumber();
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number.");
			num1 = sc.nextInt();
			System.out.println("Enter the second number.");
			num2 = sc.nextInt();

			result = hcf.findHCF(num1, num2);
			System.out.println("The HCF of " + num1 + " and " + num2 + " is " + result + ". Using euclidean algo!!");

			result = hcf.getHCF(num1, num2);
			System.out.println("The HCF of " + num1 + " and " + num2 + " is " + result
					+ ". Optimised implementation of euclidean algo!!");

			result = hcf.findGCF(num1, num2);
			System.out.println("The HCF of " + num1 + " and " + num2 + " is " + result + ". Using basic  algo!!");
		} catch (Exception e) {
			System.out.println("Please provide the input in integer numbers only.");
		}
	}
}
