//BMICalculator.java
/*I created this BMI calculator which is my first project outside college*/


import java.util.Scanner;

public class BMICalculator{
	public static void main(String args[])
	{
		
	float weight, height;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Please in your weight in KG: ");
	weight=input.nextFloat();
	
	System.out.print("Please enter your height in Meters: ");
	height=input.nextFloat();
	
	System.out.println("\n**********BMI RESULTS**********"+ "\n\nYour BMI is "+String.format("%.2f", weight/(height*height)));
		
	
	}
}