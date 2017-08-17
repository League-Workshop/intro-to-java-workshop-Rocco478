package day5;

import java.util.Random;

import javax.swing.JOptionPane;

public class quizgame {
	public static void main(String[] args) {
		int random = new Random().nextInt(4);
		
		String A = JOptionPane.showInputDialog("how many strikes do you have in baseball?");
		 int  C= Integer.parseInt(A );
		if (C== 3) {
			JOptionPane.showMessageDialog(null, "correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
	

String B =JOptionPane.showInputDialog("What is my first middle name?");

	if(B.equals("Francis"))
	{
		JOptionPane.showMessageDialog(null, "Correct");
	}
	else
	{
		JOptionPane.showMessageDialog(null, "Wrong");
	}
}}
