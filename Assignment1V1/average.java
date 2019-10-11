//30012020 Brandon Sin
package files;
import java.util.ArrayList;
import java.util.Scanner;

public class average extends addition {
	
	averageData data = new averageData(new ArrayList<Double>());


	public void doAverage() {
		System.out.println("Enter the numbers to be averaged - Type Done when finish?");
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextDouble()){
			data.inputs.add(scanner.nextDouble());
			
		}
		
		scanner.close();
		doAddition(data.inputs);
		
		double sum = super.sum;
		data.avg = sum / data.inputs.size();
	}
	public void printAvg() {
		System.out.println("The Average is: " + data.avg);
	}
	
}
