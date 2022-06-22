package simple;

import java.util.Scanner;

//time complexity of this code is theta(d) where d is the number of digits in number.

public class PalindromeNumber{

	void isPalindrome(int number) {
		int reverse = 0;
		int temp = number;
		while (temp != 0) {
			int lastDigit = temp % 10;
			reverse = reverse * 10 + lastDigit;
			temp = temp / 10;

		}
		if (reverse == number) {
			System.out.println("This number: " + number + " is a palindrome number");
		} else {
			System.out.println("This number: " + number + " is not a palindrome number");
		}
		
		
	}

	public static void main(String[] args) {
		int number = 0;
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number which we need to check of palindrome or not.");
			number = sc.nextInt();
			palindromeNumber.isPalindrome(number);
			
		} catch (Exception e) {
			System.out.println("Please provide the input in integer numbers only.");
		}

	}

}
