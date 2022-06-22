package simple;

public class TestHoldJob {
	TestToPassData passData= new TestToPassData();

	boolean statusTest = false;

	public boolean isStatus() {
		return statusTest;
	}

	public void setStatus(boolean status) {
		this.statusTest = status;
	}

	public void testPrint() {
		System.out.println("Status in testPrint:" + statusTest);
	}

	public void execute() {
		setStatus(true);
    
		System.out.println("Status in execute:" + statusTest);
	}

	public void testPrint1() {
		boolean s = isStatus();
		 passData.testPrint3(statusTest);
		System.out.println("Status in testPrint1:" + s);
	}

	public void execute1() {
		setStatus(false);

		System.out.println("Status in execute1:" + statusTest);
	}

	public void testPrint2() {
		boolean s = isStatus();
		System.out.println("Status in testPrint2:" + s);
	}
}
