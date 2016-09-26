// Welcome2.java
// Printing multiple lines in a dialog box
// Using Swing Component JOptionPane

package Chapter1;

// Java packages
import javax.swing.JOptionPane;  // program uses JOptionPane

public class Welcome2 {

   // main method begins execution of Java application
   public static void main( String args[] )
   {
      JOptionPane.showMessageDialog(
         null, "Welcome\nto\nJava\nProgramming!" );
      
      JOptionPane.showMessageDialog(
    	         null, "My name is\nDaniel Woods." );
      
      JOptionPane.showMessageDialog(
    	         null, "I love to\nprogram in\nJAVA!" );
      

      System.exit( 0 );  // terminate application with window

   } // end method main

} // end class Welcome2

