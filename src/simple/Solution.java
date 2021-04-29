package simple;

public class Solution {
	
	 public int absolute(int I) {
	        int result=0;
	        result=Math.abs(I);
	        return result;
	         
	    }
	 
	 public double cToF(int C)
	    {
	        //Your code here
	        double fahrenheit=0;
	        fahrenheit=((C*9)/5) + 32;
	        return fahrenheit;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultAbsolute=0;
        Solution solution = new Solution();
        solution.absolute(32);
        System.out.println("Output " + resultAbsolute);
        
        double resultCtoF=0;
        Solution sol = new Solution();
        resultCtoF=sol.cToF(50);
        System.out.println("Output :" +resultCtoF);
	}

}
