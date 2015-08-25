package temp;

public class Unit3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub, receive args from outside and print
		// em.

		if (args.length > 0) {
			for (int index = 0; index < args.length; index++) {
				System.out.println("args[" + index + "] = " + args[index]);
			}
		} else
			System.out.println("Args not provided");
	}
}
