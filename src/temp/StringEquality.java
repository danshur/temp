package temp;

public class StringEquality {

	public static void main(String[] args) {
		//String result = "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < args.length; i++) {
			sb.append(args[i]);
		}
		//result = sb.toString();
		
		StringEquality.compareStrings("200", "30");		
		StringEquality.compareStrings("400", "40");
		StringEquality.compareStrings("Zulu", "Albatross");
		StringEquality.compareStrings("Market", "market");

	}
	
	public static void compareStrings(String one, String two) {
		if (one.compareTo(two) < 0) {
			System.out.println(one + " is less than " + two);
		} else if (one.compareTo(two) > 0) {
			System.out.println(one + " is more than " + two);
		} else {
			System.out.println(one + " is equal to " + two);
		}
	}

}
