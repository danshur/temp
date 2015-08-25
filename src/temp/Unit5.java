package temp;

public class Unit5 {

	public static void main(String[] args) {
		/* Write a program that uses a for loop to print out the first ten even
		numbers (beginning with 0). Use the += operator in for statement’s increment expression.
		*/
		methodOne();
		methodTwo(); //try using modulo

	}

	private static void methodTwo() {
		int counter = 1;
		for (int i = 0; i < 20; i++ ) {
			if ((i % 2) == 0)
			System.out.println("Number " + counter++ + " w modulo = " + i);
		}			
	}

	private static void methodOne() {
		int counter = 1;
		for (int i = 0; i < 20; i += 2) {
			System.out.println("Number " + counter++ + " = " + i);
		}		
	}

}
