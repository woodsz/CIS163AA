/**
 * Example16_7.java
 * Homework 10: Event Driven Programming - GUI Programming
 * Excerise 16.7
 * Change the background of a panel black or white depending on mouse button being pressed.
 */

package Chapter16;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Example16_7 extends JFrame {

	private static final long serialVersionUID = 1L;
	CustomPanel cp = new CustomPanel();
	
	
	public Example16_7() {
		
		cp.addMouseListener(new MouseAdapter(){
			

			public void mousePressed(MouseEvent e) {
				cp.setBackground(Color.black);
				cp.repaint();
			}

			public void mouseReleased(MouseEvent e) {
				cp.setBackground(Color.white);
				cp.repaint();	
			}
		});
		
		add(cp);
		
		
	} // end CONSTRUCTOR
	
	public static void main(String[] args) {
		
		Example16_7 frame = new Example16_7();
		frame.setTitle("Example 16.7");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setVisible(true);
		
	} // end method main
	
	class CustomPanel extends JPanel {
		
		private static final long serialVersionUID = 1L;

		public CustomPanel() {
			
			setBackground(Color.white);
			
		} // end CONSTRUCTOR
		
		
		
	} // end inner class CustomPanel
	
	
} // end class Example16_7
