/**
 * GradeExam.java
 * Homework 5b: 2D-Array
 * Grade and print grades in increasing order.
 */

package Chapter7;


public class GradeExam {

	public static void main(String[] args) {
		
		
		
		char[][] answers = {
				{'A','B','A','C','C','D','E','E','A','D'},
				{'D','B','A','B','C','A','E','E','A','D'},
				{'E','D','D','A','C','B','E','E','A','D'},
				{'C','B','A','E','D','C','E','E','A','D'},
				{'A','B','D','C','C','D','E','E','A','D'},
				{'B','B','E','C','C','D','E','E','A','D'},
				{'B','B','A','C','C','D','E','E','A','D'},
				{'E','B','E','C','C','D','E','E','A','D'}};
		
		char[] keys = {'D','B','D','C','C','D','A','E','S','D'};
		
		int[] students = new int[8];
		int[] grades = new int[8];
		
		// grade all answers
		for(int i=0; i<answers.length;i++){
			// grade one student
			int correctCount=0;
			for(int j=0;j<answers[i].length;j++){
				if(answers[i][j]==keys[j]){
					correctCount++;
				}
			}
			students[i] = i;
			grades[i] = correctCount;
			
		}
		
		selectionSort(grades, students);
		printGrades(students, grades);
		
	} // end method main
	
	public static void selectionSort(int[ ] scores, int[] names)
	 {
	      int i, j, first, temp;
	      int sTemp;
	      for(i=scores.length-1; i>0; i--)
	      {
	           first = 0;   //initialize to subscript of first element
	           for(j=1;j<=i;j++)   //locate smallest element between positions 1 and i.
	           {
	                if(scores[j] > scores[first])         
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
	
	public static void printGrades(int[] n, int[] g){
		
		for(int i=0;i<g.length;i++){
			System.out.println("Student "+n[i]+"'s correct count is "+ g[i]);
		}
	}

} // end class GradeExam
