package simple;

public class MainClass {
	
	public static void main(String[] args){
		try{
		SumOfNaturalNum obj = new SumOfNaturalNum();
		obj.sumOfNaturalNum();
		}catch(Exception e){System.out.println("Out of limit");}
	}

}
