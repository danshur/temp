
public class NamedBeetle extends Beetle {

	public static void main(String args) {
		NamedBeetle dick = new NamedBeetle();
		NamedBeetle jane = new NamedBeetle();
		jane.move(50);
		jane.drawSquare(20);
		
		dick.turn(180);
		dick.move(50);
		jane.move(100);
		jane.drawSquare(70);
		dick.drawSquare(100); 

	}

	private void drawSquare(double side) {
		for (int inx = 0; inx < 4; ++inx) {
			move(side);
			turn(90);
		}
	}
}
