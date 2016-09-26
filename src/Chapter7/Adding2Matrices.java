/**
 * Adding2Matrices.java
 * Homework 5b: 2D-Array
 * Adding two matrices together.
 */
package Chapter7;

public class Adding2Matrices {

	public static void main(String[] args){

		// Variables	
		java.util.Scanner scanner = new java.util.Scanner(System.in);  // use scanner object
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		double[][] c = new double[3][3];
		
		
		
		// Prompt user for ten numbers	
		System.out.print("Enter Matrix1: ");
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j] = scanner.nextDouble();			}
		}
		
		System.out.print("Enter Matrix2: ");
		
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				b[i][j] = scanner.nextDouble();			}
		}
		System.out.println("The matrices are added as follows");
		
		printMatrix(a);
		printMatrix(b);
		c = addMatrix(a, b);
		printMatrix(c);
		
		scanner.close();
		
	} // end method main
	
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] c = new double[3][3];
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
			c[i][j] = (a[i][j] + b[i][j]);					
			}
		}
		return c;
	} // end method addMatrix
	
	public static void printMatrix(double[][] matrix){
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
} // end class Adding2Matrices

