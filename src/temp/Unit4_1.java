package temp;

import java.util.Arrays;

public class Unit4_1 {

	public static void main(String[] args) {
		//System.out.println(  );
		//Unit4_1.q1();
		//Unit4_1.q2();
		//Unit4_1.q3();
		//Unit4_1.q4();
		//Unit4_1.areStringsEqual("true", null); //== to compare objects
		//Unit4_1.q6(); //didnt work by 3 is right
		//Unit4_1.q7(); //never terminates
		String[] names = new String[]
				{
						"john", "jane", "sally", "spot"
				}; 
		//Unit4_1.concatenate(names); //It works, I dont get it
		//System.out.println(Arrays.toString(names));
		
		Unit4_1.q9();
	}
	
	private static void q9() {
		String value = "Hello World";
		char[] array = new char[5];
		int counter = 0;
		for (char c : value.toCharArray()) {
		  if (counter == array.length) {
		    break;
		  }
		  array[counter++] = c;
		}

		System.out.println(array);
	}

	public static String concatenate(String[] array) {

		  StringBuilder result = new StringBuilder();

		  for (int i=0; i<array.length; i++) {
		    result.append(array[i]);
		    //result.append(array[i++]);
		  }
		  System.out.println(result.toString());
		  return result.toString();
		}
	
	private static void q7() {
		int counter = 0;

		for (; counter < 10;) {

		  System.out.println(counter);

		}

		System.out.println(counter);		
	}

	private static <Beetle> void q6() {
		//Beetle array = new Beetle[10];
		//Beetle[10] array = new Beetle[];
		//Beetle[] array = new Beetle[10];
		//Beetle[] array = new Beetle[]; array.length = 10;
		
	}

	private static void q1() {
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
	public static int counter2 = 0;
	private static void q2() {
		for (int counter2 = 0; counter2 <= 10; counter2++) {
			//System.out.println("");
			System.out.println("Counter2 inside the loop = " + counter2);
			}
		System.out.println("");
		System.out.println("Counter2 outside the loop = " + counter2);
	}
	static int counter3 = 0;
	private static void q3() {
		if (counter3 > 0 && counter3++ < 1) {
			System.out.println("Counter3 inside the if = " + counter3);
			  counter3++;
			  
			}
		System.out.println("Counter3 outside the if = " + counter3);
	}
	
	private static void q4() {
		final String Str1 = new String();
		final String str2 = null;
		if (str2.equals("")) {

			  System.out.println("The string is not defined");

			} else {

			  System.out.println("This is a valid string");
			}
	}
	//private static void q5() {
	
	public static boolean areStringsEqual(String str1, String str2) {
			  if (str1.equals(str2)) {
				System.out.println("true");
			    return true;
			  }
			  System.out.println("false");
			  return false;
	}
	
	
	//}
}
