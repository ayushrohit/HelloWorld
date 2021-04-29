package simple;

public class DivisorsOfNumber {
	
	void printDivisors(int number){
		for(int i =1;i<=number;i++){
			if(number%i==0){
				System.out.println("The divisors of number is :" +i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisorsOfNumber divisors = new DivisorsOfNumber();
		divisors.printDivisors(6);
	}

}
