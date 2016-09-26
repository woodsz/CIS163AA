/*
 * 	FeetAndMeters.java
 * 	Assignment 8: Homework 4: Methods
 * 	Excersise 5.9
 * 	Displays the result of feet coverted to meters and than meters to feet
 */

package Chapter5;

public class FeetAndMeters {

	public static void main(String[] args) {
		
		double j = 20.0;
		
		System.out.println("Foot\tMeter\tMeter\tFoot");
		for(double i=1.0;i<=10;i++){
			System.out.println(i + "\t" + feetToMeters(i) + "\t" + j + "\t" + metersToFeet(j));
			j += 5;
		}
		
		System.exit(0);

	} // end method main
	
	
	/* converts feet into meters from a giving nuumber */
	public static double feetToMeters(double foot){
		
		double meter = 0.305 * foot;
		
		return meter;
	}
	
	/* converts meters into feet from a giving nuumber */
	public static double metersToFeet(double meter){
		
		double foot = Math.round((meter / 0.305)*1000.0)/1000.0;
		
		return foot;
	}

} // end class FeetAndMeters
