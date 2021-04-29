package simple;

import java.util.Scanner;

public class SumOfNaturalNum {

	void sumOfNaturalNum() {
		int sum = 0;
		int i = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value till which you wants to find the sum.");
		i = sc.nextInt();

		sum = i * (i + 1) / 2;

		System.out.println("The sum of first " + i + " natural number is :" + sum);

	}

	public static void main(String[] args) {
		try {
			SumOfNaturalNum obj = new SumOfNaturalNum();
			obj.sumOfNaturalNum();
		} catch (Exception e) {
			System.out.println("Out of limit");
		}
	}

}
