package day3;

import java.util.Random;

import javax.swing.JOptionPane;

public class magic {


		// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
for (int i = 0; i <4; i++) {
	

int random= new Random().nextInt(4);


		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

		// 3. Print out this variabl
		// 4. Get the user to enter a question for the 8 ball
System.out.println(random);
		// 5. If the random number is 0
String answer=JOptionPane.showInputDialog("Ask me a question");
if(random==0){
JOptionPane.showMessageDialog(null,"Yes");
}
	// -- tell the user "Yes"
if(random==1){
JOptionPane.showMessageDialog(null, "No");
}
if(random==2){
JOptionPane.showMessageDialog(null,"Mabye you should ask Google");
}
if(random==3){
String A=JOptionPane.showInputDialog("Type your own answer");
}

}
// 6. If the random number is 1

		// -- tell the user "No"

		// 7. If the random number is 2

		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3

		// -- write your own answer

	}

private static void Syso(int random) {
	// TODO Auto-generated method stub
	
}

}

