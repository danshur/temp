package temp;

import javax.swing.JOptionPane;

public class Unit4 {
	public static void main(String[] args) {
		String message = "Please enter your name";
		String name = JOptionPane.showInputDialog(null, message);

		if (name != null && name.length() != 0) {
			System.out.println("Your name: " + name);
			JOptionPane.showMessageDialog(null, "Hello " + name);
		} else {
			System.out.println("no name entered");
			JOptionPane.showMessageDialog(null, "You failed to enter a name.");
		}
		
		
	}

}
