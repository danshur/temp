
public class TwistedBeetle extends Beetle {

	public static void main(String[] args) {
		new TwistedBeetle();
	}

	public TwistedBeetle(double degree) {
		super.turn(degree);
	}

	public TwistedBeetle(double degree, double distance) {
		super.turn(degree);
		super.move(distance);
	}

	public TwistedBeetle() {
		// TODO Auto-generated constructor stub
	}

}
