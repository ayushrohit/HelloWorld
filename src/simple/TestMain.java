package simple;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestHoldJob test =new TestHoldJob();
		
		test.testPrint();
		test.execute();
		boolean s = test.isStatus();
		System.out.println(s);
		/*test.testPrint1();
		test.execute1();
		test.testPrint2();*/
		
		
	}

}
