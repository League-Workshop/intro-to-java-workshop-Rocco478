package day3;

// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class Birthday {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "November 12th";
		String dadsBirthday = "December 31fst";
		String myBirthday = "September 22nd";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String answer=JOptionPane.showInputDialog("what birthday do you want");
	JOptionPane.showMessageDialog(null,answer);
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
