package temp;

public class Unit5_quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q1();
		q2();
		q3();
		System.out.println("");
		q4();
		System.out.println("");
		q5();
		System.out.println(q6("dan"));
		q7();
	}

	private static String q6(String name) {
		//public static String sayHello(String name) {
		    return "Hello " + name;
		  //}
	}

		
	private static void q5() {
		/*
		 * Which statement about class methods is false?
				-A class method is a static method
				-A class method can be invoked at any time
				A class method is a public method
				-A class method is defined within a class		
		 */
		System.out.println("");
	}

	private static void q4() {
		/*
		 * What will be displayed?
		 * 
			0 0
			1 1
			1 2
			2 2
		 */
		int number = 1;
		int value = number *= 1 + 1;
		System.out.print(value + " ");
		System.out.print(number);
	}

	private static void q3() {
		/*
		 * What will be displayed?
			1 1 1
			0 1 2
			1 2 3
			0 0 0
		 */
		int number = 0;
		for (int i = 0; i<3; i++) {
		  number += 1;
		  System.out.print(number + " ");
		}
		
	}

	private static void q2() {
		/*What is the problem with the following method?
				public char[] break(String string) {
				  return string.toCharArray();
				}

				It should not be public
				The parameter 'string' is a keyword
				It should return an array of char
				The method name 'break' is a keyword
		*/
		System.out.println("The method name 'break' is a keyword");
	}

	private static void q1() {
		/*
		 * What is a good choice of identifier for a class that corresponds to a motorcycle?
			public class motorcycle
			public class _motorcycle
			public class Motorcycle
			public class MOTORCYCLE
		 */
		System.out.println("public class Motorcycle");		
	}

}
