package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot r2d2 = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		r2d2.penDown();
		// 5. Set the pen width to 5
		r2d2.setPenWidth(5);
		// 6. Do steps #7 to #8 four times..
		// 7. Set the pen color to random
		r2d2.setRandomPenColor();
		// 1. Call the drawSquare() method
		drawSquare();
		// 8. Turn the robot 90 degrees to the right
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {

		for (int i = 4; i < 4; i++){
			r2d2.move(150);
		r2d2.turn(90);
		r2d2.setSpeed(20);
		}

	
	}
	public static void main(String[] args) {
		new FourSquare().go();
	}

}