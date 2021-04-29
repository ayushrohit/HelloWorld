package simple;

import java.util.Scanner;

public class PrimeFactors {

	void printPrimeFactors(int number) {

		if (number <= 1)

			return;
		for (int i = 2; i * i <= number; i++) {
			while (number % i == 0) {
				System.out.println(" The  prime factor is : " + i);
				number = number / i;
			}
		}
		if (number > 1)
			System.out.println(" The  prime factor is : " + number);
	}

	public static void main(String[] args) {
		PrimeFactors primeFactors = new PrimeFactors();

		int number = 0;
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number to find the prime factors");
			number = sc.nextInt();
			primeFactors.printPrimeFactors(number);
		} catch (Exception e) {
			System.out.println("Please provide a proper input");
		}
	}

}
