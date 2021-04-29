package simple;

import java.util.Scanner;

public class LCMOfNumbers {
//to get the HCF 
	int getHCF(int a, int b) {

		if (b == 0)
			return a;
		else
			return getHCF(b, a % b);
	}
//to get the LCM 
	int getLCM(int a, int b) {

		return (a * b) / getHCF(a, b);
	}

	public static void main(String[] args) {
		int num1, num2, result = 0;

		LCMOfNumbers lcm = new LCMOfNumbers();

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number.");
			num1 = sc.nextInt();
			System.out.println("Enter the second number.");
			num2 = sc.nextInt();
			result = lcm.getLCM(num1, num2);
			System.out.println("The lcm of " + num1 + " and " + num2 + " is " + result);
		} catch (Exception e) {
			System.out.println("Please provide integer inputs only");
		}
	}
}
