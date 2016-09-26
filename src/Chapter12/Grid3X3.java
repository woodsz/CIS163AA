/**
 * SwingCommonFeatures.java
 * Homework 9: Introduction to GUI Basics and Gaphics
 * Excerise 15.1
 * 	Display a 3X3 grid; horizontal lines are blue and vertical lines red.
 */


package Chapter12;

import java.awt.*;
import javax.swing.*;


@SuppressWarnings("serial")
public class Grid3X3 extends JFrame {
	
	/** VARIABLES */

	
	/** CONSTRUCTOR */
	public Grid3X3() {
		
		setTitle("3 X 3 Grid");
		setSize(300,150);
		add(new MyPanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	} // end CONSTRUCTOR


	public static void main(String[] args) {
		
		new Grid3X3();

	} // end method main

} // end class Grid3X3



@SuppressWarnings("serial")
class MyPanel extends JPanel {
	
	
	/** CONSTRUCTOR */
	public MyPanel() {
		
		setSize(300, 150);
		
	} // end CONSTRUCTOR
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// get starting points for lines
			// horizontal lines
		int h1Point = getWidth() / 3;
		int h2Point = h1Point + getWidth() / 3;
			
			// vertical lines
		int v1Point = getHeight() / 3;
		int v2Point = v1Point + getHeight() / 3;	
		
		
		// horizontal lines that are red
		g.setColor(Color.blue);
		g.drawLine(0, v1Point,getWidth(),v1Point);
		g.drawLine(0, v2Point,getWidth(),v2Point);
		
		// vertical lines that are blue
		g.setColor(Color.red);
		g.drawLine(h1Point,0,h1Point,getHeight());
		g.drawLine(h2Point,0,h2Point,getHeight());
		
		
	} // end method paintComponent
	
} // end class MyPanel