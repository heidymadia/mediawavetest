package biz.mediawave;

public class PascalPyramid {
	public static void main (String[] args) {
		// Setting parameter
		int n = 8;
		for (int i = 0; i < n; i ++) {
			// Make sure only draw when even number
			if (i % 2 == 0) {
				//
				// Printing the space
				//
				for (int j = 1; j < (n-i); j++) {
					System.out.print(" ");
				}
				
				//
				// Printing the asterisks
				//
				for (int k = 0; k <= i; k++) {
					System.out.print("* ");
				}
				
				//
				// Printing new line
				//
				System.out.println();
			}
		}
	}

}
