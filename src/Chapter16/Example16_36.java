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
import javax.swing.border.LineBorder;


public class Example16_36 extends JFrame {


	private static final long serialVersionUID = 1L;
	JPanel p1 = new JPanel(new GridLayout(3, 3));
	
	public Example16_36() {
				
		for(int i=0;i<9;i++) {
			
			p1.add(new CustomLabel());
		}
		
		add(p1);
		
	} // end CONSTRUCTOR
	
	public static void main(String[] args) {
		
		Example16_36 frame = new Example16_36();
		frame.setTitle("Example 16.36");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
		
	} // end method main
	
	class CustomLabel extends JLabel {
		

		private static final long serialVersionUID = 1L;
		String message = "H";
		
		public CustomLabel() {
			
			setBackground(Color.white);
			setFont(new Font("Ariel", Font.BOLD, 18));
			setPreferredSize(new Dimension(80,40));
			setBorder(new LineBorder(Color.black, 1));
			
			addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent me) {
					flip();
				}
			});
			
		} // end CONSTRUCTOR
		
		public void flip() {
			
			/**  
			 *  I didn't know if the coin was just suppose to flip from heads to tails.
			 *  This method simulates a random coin flip: either tails or heads.
			 *  I hope this was the right way.  
			 */
			
			int num = (int)(Math.random() * 2) + 1;
			if(num == 1) {
				message = "T";
				repaint();
			}
			else{
				message = "H";
				repaint();
			}
		}
		
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString(message, (getWidth() / 2) - 9, (getHeight() /2) + 9);
		}
		
		
	} // end inner class CustomPanel
	
	
} // end class Example16_7
