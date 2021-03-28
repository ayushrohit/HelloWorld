package simple;

import java.util.Scanner;

public class SumOfNaturalNum {
	
	int sumOfNaturalNum(int n){
		return n*(n+1)/2;
		
	}
	
	public static void main(String[] args)
	{
		int sum=0;
		int i=0;
		
		SumOfNaturalNum a = new SumOfNaturalNum();
		Scanner sc = new Scanner(System.in);
		try{
		System.out.println("Enter the value till which you wants to find the sum.");
		i=sc.nextInt();
		
		sum= a.sumOfNaturalNum(i);
		
		System.out.println("The sum of first " +  i  +  " natural number is :" + sum);
		}
		catch(Exception e){
			System.out.println("Out of limit");
			//System.out.println(e);
		}
		
			
		   }
	}
	


