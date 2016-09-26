/**
 * SortingStudents.java
 * Homework 5a: 1D Array
 * 6.19
 * Sorting students' grades in desending order.
 * 
 */

package Chapter6;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class SortingStudents {

	public static void main(String[] args) {

	String temp;
	int num_of_students;
	String[] names;
	int[] scores;
	
	temp = JOptionPane.showInputDialog("How many students for the class.");	
	num_of_students = Integer.parseInt(temp);
	
	names = new String[num_of_students];
	scores = new int[num_of_students];
	
	for(int i=0;i<num_of_students;i++){
		
		studentInfo(names, scores, i);
		
	}
	
	selectionSort(scores, names);
	
	JOptionPane.showMessageDialog(null, new JTextArea(printScores(names,scores)));

	} // end method main

	public static void studentInfo(String[] names, int[] score, int index){
		
		String temp;
		
		// Take in a name and score for a student
		names[index] = JOptionPane.showInputDialog("Enter student's name: ");
		
		temp = JOptionPane.showInputDialog("Enter student's score: ");
		score[index] = Integer.parseInt(temp);
		
	} // end class studentInfo	
	
	public static String printScores(String[] names, int[] scores){		
		
		String message = "NAMES\tSCORES\n";
		for(int i=0;i<names.length;i++){
			message += names[i]+"\t"+scores[i]+"\n";
		}
		
		return message;
		
	} // end method printScores
	
	public static void selectionSort(int[ ] scores, String[] names)
	 {
	      int i, j, first, temp;
	      String sTemp;
	      for(i=scores.length-1; i>0; i--)
	      {
	           first = 0;   //initialize to subscript of first element
	           for(j=1;j<=i;j++)   //locate smallest element between positions 1 and i.
	           {
	                if(scores[j]<scores[first])         
	                  first = j;
	           }
	           temp = scores[first];   //swap smallest found with element in position i.
	           sTemp = names[first];
	           scores[first] = scores[i];
	           names[first] = names[i];
	           scores[i] = temp; 
	           names[i] = sTemp;
	       }           
	 } // end method selectionSort
	
} // end class SortingStudents
