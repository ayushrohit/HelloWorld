/**
 * 
 */
package simple;

import java.util.Scanner;

/**
 * @author Ayush This class will have a method which will return all the number
 *         that is prime and less than or equal to the input number.
 */
public class SieveOfEratosthenes {

	boolean checkPrime(int number) {

		if (number == 1)
			return false;
		if (number == 2 || number == 3)
			return true;
		if (number % 2 == 0 || number % 3 == 0)
			return false;
		for (int i = 5; i * i <= number; i = i + 6)
			if (number % i == 0 || number % (i + 2) == 0)
				return false;
		return true;

	}

	void printPrimes(int number) {
		for (int i = 2; i <= number; i++) {
			if (checkPrime(i)) {
				System.out.println("Prime number is : " + i);
			}

		}
	}

	void sieveOfEratosthenes(int number) {

		// Initializing all the value as true
		boolean prime[] = new boolean[number + 1];
		for (int i = 0; i <= number; i++)
			prime[i] = true;

		for (int p = 2; p * p <= number; p++) {
			if (prime[p] == true) {

				for (int i = p * p; i <= number; i += p) {
					prime[i] = false;
				}
			}
		}

		for (int i = 2; i <= number; i++) {
			if (prime[i] == true)
				
			System.out.println("Prime number less than or equal to the given input number is as follow : " + i);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;

		SieveOfEratosthenes primeNumber = new SieveOfEratosthenes();
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			number = sc.nextInt();
			// primeNumber.printPrimes(number);
			primeNumber.sieveOfEratosthenes(number);
		} catch (Exception e) {
			System.out.println("Please give proper inputs");
		}
	}

}
