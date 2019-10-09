//30012020 Brandon Sin
package files;

import java.util.Scanner;

public class averageSpeed extends addition{
	
	double avgSpeed;
	public int numberSize;
	public int numberArray[];
	Scanner input;
	

	public void doAverageSpeed() {
		System.out.println("How many distances are you going to enter:");
		input = new Scanner(System.in);
		numberSize = input.nextInt();
		numberArray = new int[numberSize];
		System.out.println("Enter all the distances: (ex. 5 2 3)");
		
		for(int counter = 0; counter < numberSize; counter++) {
			numberArray[counter] = input.nextInt();
		}
		
		doAddition(numberSize, numberArray);
		double totalDistance = super.sum;
	
		System.out.println("How many different times are you going to enter:");
		input = new Scanner(System.in);
		numberSize = input.nextInt();
		numberArray = new int[numberSize];
		System.out.println("Enter all the times: (ex. 5 2 3)");
		
		for(int counter = 0; counter < numberSize; counter++) {
			numberArray[counter] = input.nextInt();
		}
		
		doAddition(numberSize, numberArray);
	    double totalTime = super.sum;
		
		avgSpeed = totalDistance / totalTime;
		
	
	}
	
	
	public void printAvgSpeed() {
		
		System.out.println("The average speed is: " + avgSpeed);
	
		
	}

}
