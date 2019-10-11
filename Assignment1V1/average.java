//30012020 Brandon Sin
package files;
import java.util.ArrayList;
import java.util.Scanner;

public class average extends addition {
	
	double avg;
	int size;
	int arraySize[];
	ArrayList<Double> inputs = new ArrayList<Double>();

	
	public void doAverage() {
		System.out.println("Enter the numbers to be averaged - Type Done when finish?");
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextDouble()){
			inputs.add(scanner.nextDouble());
			
		}
		
		scanner.close();
		doAddition(inputs);
		
		double sum = super.sum;
		avg = sum / inputs.size();
	}
	public void printAvg() {
		System.out.println("The Average is: " + avg);
	}
	
}
