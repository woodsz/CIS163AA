/**
 * Example16_1.java
 * Homework 10: Event Driven Programming - GUI Programming
 * Excerise 16.1
 * Display in the console which button was pressed
 */

package Chapter16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Example16_1 extends JFrame{

	private static final long serialVersionUID = 1L;
	ButtonListener bl = new ButtonListener();
	JPanel p1 = new JPanel(new FlowLayout());
	JPanel p2 = new JPanel(new FlowLayout());
	JButton b1 = new JButton("Button 1");
	JButton b2 = new JButton("Button 2");
	JButton b3 = new JButton("Button 3");
	JButton b4 = new JButton("Button 4");
	JButton b5 = new JButton("Button 5");
	JButton b6 = new JButton("Button 6");
	
	
	public Example16_1() {
		
		setLayout(new FlowLayout());
		
		b1.addActionListener(bl);
		b2.addActionListener(bl);
		b3.addActionListener(bl);
		b4.addActionListener(bl);
		b5.addActionListener(bl);
		b6.addActionListener(bl);
		
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		
		add(p1);
		add(p2);
		
	} // end CONSTRUCTOR
	
	public static void main(String[] args) {
		
		Example16_1 frame = new Example16_1();
		frame.setTitle("Example 16.1");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 80);
		frame.setVisible(true);
		
	} // end method main
	
	class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand() + " was clicked");
		} // end method actionPerformed
	} // end inner class ButtonListener
	
} // end class Example16_1
