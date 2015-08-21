package temp;

public class Unit4_1 {

	public static void main(String[] args) {
		
		boolean one = true;
		boolean two = false;

		if (one || two) {

		  System.out.print("Java is ");

		}

		boolean three = one & two;

		if (three) {

		  System.out.print("not ");

		}

		if (!(one && two)) {

		  System.out.print("easy");

		}	
	}

}
