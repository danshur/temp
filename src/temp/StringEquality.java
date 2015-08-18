package temp;

public class StringEquality {

	public static void main(String[] args) {
		String result = "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < args.length; i++) {
			sb.append(args[i]);
		}
		result = sb.toString();
		//compareStreings(“200”, “30”);
		
		//String a = "200";
		//String b = "30";
		
		
		//System.out.println(“200”.compareTo(“30”));
		//System.out.println(“400” and “40”);
		///System.out.println(“Zulu” and “Albatross”);
		//System.out.println(“Market” and “market”); 
		
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

}
