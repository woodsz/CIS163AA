/**
 * Example17_1.java
 * Homework 10 - Event-Driven Programming - GUI progarmming.
 * Example 17.1
 * Using RadioButtons to change color of background.
 */

package Chapter17;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Example17_1 extends JFrame { 
	
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

// Create a panel for displaying message
  protected MessagePanel messagePanel
    = new MessagePanel("Welcome to Java");
  
  // Create a panel for the radio buttons
  protected RadioButtonPanel rbpanel =
	new RadioButtonPanel(messagePanel);	

  // Declare two buttons to move the message left and right
  private JButton jbtLeft = new JButton("<=");
  private JButton jbtRight = new JButton("=>");

  public static void main(String[] args) {
	Example17_1 frame = new Example17_1();
    frame.setTitle("Example 17.1");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(350, 200);
    frame.setVisible(true);
  }

  public Example17_1() {
    // Set the background color of messagePanel
    messagePanel.setBackground(Color.white);

    // Create Panel jpButtons to hold two Buttons "<=" and "right =>"
    JPanel jpButtons = new JPanel();
    jpButtons.add(jbtLeft);
    jpButtons.add(jbtRight);

    // Set keyboard mnemonics
    jbtLeft.setMnemonic('L');
    jbtRight.setMnemonic('R');

    // Set icons and remove text
//    jbtLeft.setIcon(new ImageIcon("image/left.gif"));
//    jbtRight.setIcon(new ImageIcon("image/right.gif"));
//    jbtLeft.setText(null);
//    jbtRight.setText(null);

    // Set tool tip text on the buttons
    jbtLeft.setToolTipText("Move message to left");
    jbtRight.setToolTipText("Move message to right");

    // Place panels in the frame
    setLayout(new BorderLayout());
    add(rbpanel, BorderLayout.NORTH);
    add(messagePanel, BorderLayout.CENTER);
    add(jpButtons, BorderLayout.SOUTH);

    // Register listeners with the buttons
    jbtLeft.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.moveLeft();
      }
    });
    jbtRight.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.moveRight();
      }
    });
    
  } // end CONSTRUCTOR
  
  public class RadioButtonPanel extends JPanel {
	  
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Create JRadioButtons
	  private JRadioButton jbRed = new JRadioButton("Red");
	  private JRadioButton jbYellow = new JRadioButton("Yellow");
	  private JRadioButton jbWhite = new JRadioButton("White");
	  private JRadioButton jbGray = new JRadioButton("Gray");
	  private JRadioButton jbGreen = new JRadioButton("Green");
	  private ButtonGroup bg = new ButtonGroup();
	  
	  MessagePanel mp = null;
	  
	  // CONSTRUCTOR
	  public RadioButtonPanel(final MessagePanel mp) {
		
		// Get instance of MessagePanel  
		this.mp = mp;
		
		// Set panel properties  
		setLayout(new FlowLayout());
		setBorder(new TitledBorder("Select Message Panel Background"));
		
		ActionListener al = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Red")) {
					mp.setBackground(Color.red);
				}
				else if(e.getActionCommand().equals("Yellow")) {
					mp.setBackground(Color.yellow);
				}
				else if(e.getActionCommand().equals("White")) {
					mp.setBackground(Color.white);
				}
				else if(e.getActionCommand().equals("Gray")) {
					mp.setBackground(Color.gray);
				}
				else if(e.getActionCommand().equals("Green")) {
					mp.setBackground(Color.green);
				}
				else{
					System.out.print("Sorry!!! No color.");
					System.exit(0);
				}
			}
			
		};
		
		// Add Actionlistener to buttons
		jbRed.addActionListener(al);		
		jbYellow.addActionListener(al);
		jbWhite.addActionListener(al);
		jbGray.addActionListener(al);
		jbGreen.addActionListener(al);
				
		// Add buttons to Button Group
		bg.add(jbRed);
		bg.add(jbYellow);
		bg.add(jbWhite);
		bg.add(jbGray);
		bg.add(jbGreen);
		
		// Add buttons to panel
		add(jbRed);
		add(jbYellow);
		add(jbWhite);
		add(jbGray);
		add(jbGreen);
		  
		  
	  } // end CONSTRUCTOR 
	  
  } // end inner class RadioButtonPanel
  
} // end class Example17_1
