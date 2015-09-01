
public class TintedBeetle extends Beetle {

	public static void main(String[] args) {
		TintedBeetle tiny = new TintedBeetle();
		TintedBeetle tintin = new TintedBeetle("red");
		tiny.makeCircle(15);
		tintin.move(40);
		tintin.makeCircle(64);
	}

	private String color;

	public TintedBeetle(String color) {
		//this.color = color;
		super(color);
	}

	public TintedBeetle() {
		super("black");
	}

}
