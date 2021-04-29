package simple;

import java.util.Scanner;

public class IterativePower {

	int powerIterative(int x, int n) {
		int result = 1;
		while (n > 0) {
			if (n % 2 != 0) {
				result = result * x;}
				else{
				x = x * x;
				n = n / 2;}
			}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		int power=0;
		int result=0;
		IterativePower computePower = new IterativePower();
		
	
		
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number.");
			number = sc.nextInt();
			System.out.println("Enter the power.");
			power = sc.nextInt();
			
			result=computePower.powerIterative(number, power);
			System.out.println("The result  :" +result);
		} catch (Exception e) {
			System.out.println("Please provide a proper input");
		}
	}
	}


