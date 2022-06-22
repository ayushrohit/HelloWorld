package simple.recurrsion;

public class RecurssionOutput {
	//to  chekc the output
	static void fun(int n)
	{
    if (n==0)
    	return;
    fun(n-1);
    System.out.println(n);
    fun(n-1);
	}
	//
	 int  func(int n ){
		
		if(n==1)
			return 0;
		else
			return 1+ func(n/2);
		
		
	}
	 //it will return the binary value of n where n>2.
	 void funct(int n ){
		 
		 if(n==0)
			 return;
		 funct(n/2);
		 System.out.println(n%2);
	 }
	 
	 //to print the number from n to 1,where n >=1.
	  void printNto1(int n ){
		  if(n<1)
			  return;
		  System.out.println(n);
		  printNto1(n-1);
	  }
	  
	  //to print the number from 1 to n where n is the input and is n>=1.
	  void print1toN(int n ){
		  if(n==0)
			  return;
		  print1toN(n-1);
		  System.out.println(n+ " ");
		  
	  }
	  
	  //to find the factorial of n where n>=1 .
	  
	  int fact( int n){
		  if(n==0)
			  return 1;
		  else
			  return n * fact(n-1);
		  
	  }
	  
	  //to find the fibonacci number where n is input and n<=1
	  int fib(int n){
		  if(n<=1)
			  return n;
		  else 
			  return fib(n-1) + fib(n-2);
		  
	  }
	  
	  //to find the sum of first n natural number 
	  int getSum(int n){
		  if(n==0)
			  return 0;
		  else 
			  return  n + getSum(n-1);
		  
	  }
	  
	  //to check if a number is palindrome or not 
	  boolean isPalindrome(String str,int start , int  end){
		  if(start>=end)
			  return true;
		  else
		return (str.charAt(start)==str.charAt(end) && (isPalindrome(str,start+1,end-1))) ;
		  
	  }
	  
	  //to find the sum of digits in a number where n>=0
	  
	  int sumOfDigits(int n){
		  if(n<=0)
			  return 0;
		  else 
			  return sumOfDigits(n/10) + n%10;
	  }
	  
	/*  //rope cutting problem where we take 4 input.n=length og rope;a,b,c= lenght in which we want to cut the ropr.
	  //we have to find the max number in which we can cut the rope.
	  
	  int maxPieces(int n, int a,int b,int c){
		  if(n==0) return 0;
		  if (n<0) return -1;
		  
		  int res =max(maxPieces((n-a),a,b,c),maxPieces((n-b),a,b,c),maxPieces((n-c),a,b,c));
	  if (res==-1) return -1;
	   return res=res+1;
	  }*/
	  
	/*  //to generate subsets of a string
	  void subSets(String str, String curr,int i){
		  if(i==str.length()){
			  System.out.println(str);
			  return;
		  }
		  subSets(str,curr,i+1);
		  subSets(str,curr+str[i],i+1);
	  }*/
	  
	  //tower of hanoi
	  void tOH(int n,char A,char B,char C){
		  if(n==1){
			  System.out.println("Move 1 from " + A + " to "+C);
			  return;
			  
		  }
		  tOH((n-1),A,C,B);
		  System.out.println("Move " +n+ " from " + A + " to "+C);
		  tOH((n-1),B,A,C);
		  
	  }
	  //josephus problem
	  int josephus(int n,int k){
		  if(n==1)
			  return 0;
		  else
			  return (josephus(n-1,k)+k)%n;
		  
	  }
	  
	  //Profram will return the number of subset having the value as sum.
	  //Sum of subsets problem. Here the input is an array,lenght of array,and sum.
	  int countSubset(int arr[], int n,int sum){
		  if(n==0)
			  return (sum==0)?1:0;
		  
		  

		  return countSubset(arr,n-1,sum) + countSubset(arr,n-1,sum-arr[n-1]);
	  
	  }
	public static void main(String args[]){
		//fun(3);
		  boolean flag=false;
		int res=0;
		 int intArray[] = {10,20,30};
		RecurssionOutput ro=new RecurssionOutput();
		res=ro.func(16);
		System.out.println(res);
		ro.funct(13);
		ro.printNto1(3);
		ro.print1toN(4);
		res=ro.fact(4);
		System.out.println("Factorial : "+res);
		res=ro.fib(3);
		System.out.println("Fibonacci : "+res);
		res=ro.getSum(3);
		System.out.println("Sum : "+res);
		
		flag=ro.isPalindrome("1222", 0, 3);
		if(flag==true)
			
		System.out.println("The string is palindrome");
		else System.out.println("The string is not palindrome");
		
		res=ro.sumOfDigits(235);
		System.out.println("Sum of digits: "+res+"\n");
		
		//ro.subSets("abc","",0);
		
		ro.tOH(3, 'A', 'B', 'C');
		
		res=ro.josephus(5, 3);
		System.out.println("Josephus output: "+res+"\n");
		
		res=ro.countSubset(intArray, 3, 30);
		System.out.println("Subset count: "+res+"\n");
		
	}

}
