package simple;

public class PrintingPattern {
	// to print start in pyramid pattern
	void pyramidPattern() {

		int i, j, row = 4;
		// Outer loop work for rows
		for (i = 1; i < row; i++) {
			// inner loop work for space
			for (j = row - i; j > 1; j--) {
				// prints space between two stars
				System.out.print(" ");
			}
			// inner loop for columns
			for (j = 1; j <= i; j++) {
				// prints star
				System.out.print("*");
			}
			// throws the cursor in a new line after printing each line
			System.out.println();
		}
	}

	void printRightTriangle(int n) {
		// to print right angle triangle pattern
		int i, j;
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("2");
			}
			System.out.println();
		}
	}

	void printLeftTriangle(int n) {

		int i, j;

		for (i = 0; i <= n; i++) {

			for (j =  (n - i); j >=0; j--) {
				System.out.print("");
			}
			for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("*");  
            }
             
            // ending line after each row
            System.out.println();
		}
	}

	public static void main(String args[]) {

		PrintingPattern PrintingPattern = new PrintingPattern();
		PrintingPattern.pyramidPattern();
		PrintingPattern.printRightTriangle(2);
		PrintingPattern.printLeftTriangle(4);

	}
}
