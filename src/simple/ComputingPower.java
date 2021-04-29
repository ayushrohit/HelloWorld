package simple;

import java.util.Scanner;

public class ComputingPower {

	void computePower(int number, int power) {
		int result = 1;
		for (int i = 0; i < power; i++) {
			result = result * number;
		}
		System.out.println("The power is: " + result);

	}
	
	
	int  powerCompute(int x, int n){
		if(n==0)
			return 1;
		int temp = powerCompute(x,n/2);
		temp=temp*temp;
		if(n%2==0)
			return temp;
		else
		return temp * x;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=0;
		int power=0;
		int result=0;
		ComputingPower computePower = new ComputingPower();
		
	
		
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number.");
			number = sc.nextInt();
			System.out.println("Enter the power.");
			power = sc.nextInt();
			computePower.computePower(number,power);
			result=computePower.powerCompute(number, power);
			System.out.println("The result throgh efficient way is :" +result);
		} catch (Exception e) {
			System.out.println("Please provide a proper input");
		}
	}

}
