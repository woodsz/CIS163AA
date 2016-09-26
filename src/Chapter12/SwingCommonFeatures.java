/**
 * SwingCommonFeatures.java
 * Homework 9: Introduction to GUI Basics and Gaphics
 * Excerise 12.8
 * 	Displaying components and modifing their attuibutes.
 */


package Chapter12;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class SwingCommonFeatures extends JFrame {
	
	/** VARIABLES */
	Font TimesRoman = new Font( "TimesRoman", Font.BOLD, 20 );
	LineBorder yellowBorder = new LineBorder( Color.yellow, 1 );
	Color BG = Color.white;
	Color[] colors = { Color.black, Color.blue, Color.cyan, Color.green, Color.magenta, Color.orange }; 
	JLabel[] labels = {new JLabel("Black"), new JLabel("Blue"), new JLabel("Cyan"), new JLabel("Green"), new JLabel("Magenta"), new JLabel("Orange")};
	
	/** CONSTRUCTOR */
	public SwingCommonFeatures() {
		
		setLayout(new GridLayout(2,3));
		
		int count = 0;
		
		for ( JLabel l : labels) {

			l.setOpaque(true);
			l.setForeground(colors[count]);
			l.setBackground(BG);
			l.setBorder(yellowBorder);
			l.setFont(TimesRoman);
			l.setToolTipText(labels[count].getText());
			add(l);
			count++;
		}
		
		setTitle("Swing Common Features");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	} // end CONSTRUCTOR


	public static void main(String[] args) {
		
		new SwingCommonFeatures();

	} // end method main

} // end class SwingCommonFeatures
