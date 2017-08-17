package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it");
		String answer = JOptionPane.showInputDialog("type an adjective");
		// Get the user to enter an adjective
		String B = JOptionPane.showInputDialog("type type of liquid");
		String C = JOptionPane.showInputDialog("type a body part");
		String D = JOptionPane.showInputDialog("type a verb");
		String E = JOptionPane.showInputDialog("type a place");
		// Get the user to enter a type of liquid

		// Get the user to enter a body part

		// Get the user to enter a verb

		// Get the user to enter a place
		JOptionPane.showMessageDialog(null,
				"Piranhas are more " + answer + " during the day, so cross the river at night. Piranhas are attracted to fresh " + B
						+ " and will most likely take a bite out of your " + C
						+ " if you "+D+" Whateveryou do, if you have an open wound, try to find another way to getback to "+E+". Good luck!");

		// Make a pop-up for the final story. You can use \n to go to the next line.

	}
}
