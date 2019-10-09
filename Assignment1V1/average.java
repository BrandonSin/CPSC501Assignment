//30012020 Brandon Sin
package files;
import java.util.Scanner;

public class average extends addition {
	
	double avg;
	int size;
	int arraySize[];
	Scanner input;
	
	public double doAverage() {
		System.out.println("how many numbers?");
		input = new Scanner(System.in);
		size = input.nextInt();
		arraySize = new int[size];
		System.out.println("Enter the numbers to be averaged: ");

		for(int counter = 0; counter < size; counter++) {
			arraySize[counter] = input.nextInt();
		}
		
		input.close();
	
		doAddition(size, arraySize);
		
		int sum = super.sum;
		double total =  size; //need to convert double to get a double as answer
		avg = sum / total;
		return avg;
	}
	public void printAvg() {
		System.out.println("The Average is: " + avg);
	}
	
}
