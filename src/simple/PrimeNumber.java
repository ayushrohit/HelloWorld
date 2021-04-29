package simple;

import java.util.Scanner;

public class PrimeNumber {
	// basic way to check if number is prime or not
	//TC is  O(n):Upper bound
	boolean isPrime(int number) {

		if (number == 1) {
			return false;
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0)
					return false;
			}
			return true;
		}
	}
	
	boolean checkPrime(int number){
		
		if(number == 1) 
			return false;
		if(number==2 || number==3)
			return true;
		if(number%2==0 || number %3==0)
			return false;
		for (int i =5;i*i<=number;i=i+6)
			if(number%i==0 || number%(i+2)==0)
				return false;
		return true;
		
		
	}

	public static void main(String[] args) {

		boolean flag = false;
		int number = 0;
		PrimeNumber primeNumber = new PrimeNumber();
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the  number.");
			number = sc.nextInt();
			//flag = primeNumber.isPrime(number);;
			flag=primeNumber.checkPrime(number);
			System.out.println("Whether number " + number + " is prime: " + flag);
		} catch (Exception e) {
			System.out.println("Please provide correct input in integer only.Thank you !!");
		}

	}
}
