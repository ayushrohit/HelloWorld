package simple.bitwise;
//program to 

public class TestBitwise {
//method to check if the kth bit si set or not
	void kthBitLS(int n, int k) {

		if ((n & (1 << (k - 1))) != 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	void kthBitRs(int n,int k){
		if((n>>(k-1)&1)==1){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -1;
		int y = 4;
		TestBitwise bitwise = new TestBitwise();
		
		// Not operator
		System.out.println(~x);

		// Left shift
		System.out.println(x << 1);
		System.out.println(x << 30);
		System.out.println(x << y);
		bitwise.kthBitLS(5, 2);
		bitwise.kthBitRs(13, 3);

	}

}
