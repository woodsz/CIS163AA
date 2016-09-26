/**
 * Example17_11.java
 * Homework 10 - Event-Driven Programming - GUI progarmming.
 * Example 17.11
 * Dynamically changing textfield properties with radiobuttons and textfield data.
 *  
 */

package Chapter17;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Example17_11 extends JFrame {

	private static final long serialVersionUID = 1L;
	// Create components 
	private JRadioButton rbLeft, rbCenter, rbRight;
	private JLabel lb1, lb2;
	private JTextField tf1, tf2;
	private JPanel pMain, pTextField, pRButtons, pTop, pBottom;
	private AL al = new AL();
	
	public Example17_11() {
		
		// Initialize and setting properties
		setLayout(new BorderLayout());
		tf1 = new JTextField(" Type any thing ");
		tf1.setColumns(30);
		tf1.setHorizontalAlignment(JTextField.CENTER);
		tf1.addKeyListener(al);
		tf2 = new JTextField("30");
		tf2.setColumns(10);
		tf2.addKeyListener(al);
		lb1 = new JLabel("Text Field");
		lb2 = new JLabel("Column Size");
			
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbLeft = new JRadioButton("Left"));
		bg.add(rbCenter = new JRadioButton("Center"));
		bg.add(rbRight = new JRadioButton("Right"));
		rbLeft.addActionListener(al);
		rbCenter.addActionListener(al);
		rbRight.addActionListener(al);
		
		rbCenter.setSelected(true);
		
		pRButtons = new JPanel(new GridLayout(1,3));
		pRButtons.setSize(tf1.getWidth()/2, 30);
		pRButtons.setBorder(new TitledBorder("Horizontal Alignment"));
		pRButtons.add(rbLeft);
		pRButtons.add(rbCenter);
		pRButtons.add(rbRight);
		
		pMain = new JPanel();
		pMain.add(lb1);
		pMain.add(tf1);
		
		pTextField = new JPanel();
		pTextField.setBorder(new LineBorder(Color.lightGray,1));
		pTextField.add(lb2);
		pTextField.add(tf2);
		
		pTop = new JPanel();
		pBottom = new JPanel();
		
		pTop.add(pMain);
		pBottom.add(pRButtons);
		pBottom.add(pTextField);
		
		add(pTop, BorderLayout.NORTH);
		add(pBottom, BorderLayout.SOUTH);
		
		
	
	}
	
	public static void main (String[] args) {
		
		Example17_11 frame = new Example17_11();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Example 17.11");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.pack();
		
	}
	
	public void setHorizontalAlignment(int i) {
		
		int ha = i;
		
		if(i == 1) {
			ha = JTextField.LEFT;
		}
		else if(i == 2) {
			ha = JTextField.CENTER;
		}
		else if(i == 3) {
			ha = JTextField.RIGHT;
		}
		else{
			System.out.println("Error making alignment to text.");
			System.exit(0);
		}
		
		tf1.setHorizontalAlignment(ha);
		revalidate();
		repaint();
	}
	
	public void setColumnSize(int i) {
		tf1.setColumns(i);
		revalidate();
		repaint();
		
	}
	
	class AL implements ActionListener, KeyListener {

		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == rbLeft) {
				setHorizontalAlignment(1);
			}
			else if(e.getSource() == rbCenter) {
				setHorizontalAlignment(2);
			}
			else if(e.getSource() == rbRight) {
				setHorizontalAlignment(3);
			}
		}

		public void keyPressed(KeyEvent e) {
			
			if(tf2.isFocusOwner() && e.getKeyCode() == KeyEvent.VK_ENTER) {
				setColumnSize(Integer.parseInt((tf2.getText())));
				System.out.println(tf2.getText());
				e.consume();
			}
			
		}

		public void keyReleased(KeyEvent e) {}

		public void keyTyped(KeyEvent e) {}
		
	}
	
	
} // end class Example17_11
