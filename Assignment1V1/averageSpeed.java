//30012020 Brandon Sin
package files;

import java.util.Scanner;
import java.util.ArrayList;

public class averageSpeed extends addition{
	
	double avgSpeed;
	ArrayList<Double> distances = new ArrayList<Double>();
	ArrayList<Double> time = new ArrayList<Double>();
	Scanner scanner;
	
	public void calcDistance() {
		System.out.println("What are all the distances? type done when finish");
		scanner = new Scanner(System.in);
		while(scanner.hasNextDouble()) {
			distances.add(scanner.nextDouble());
		}
	
		
	}
	public void calcTime() {
		System.out.println("What are the times? type done when finish");
		scanner = new Scanner(System.in);
		while(scanner.hasNextLine()) {
			if(scanner.hasNextDouble()) {
				time.add(scanner.nextDouble());
			}
			else {
				break;
			}
		}
		scanner.close();
		
	}
	
	public void doAverageSpeed() {
		doAddition(distances);
		double totalDistance = super.sum;
		doAddition(time);
	    double totalTime = super.sum;
		avgSpeed = totalDistance / totalTime;
		
	}
	
	public void printAvgSpeed() {
		
		System.out.println("The average speed is: " + avgSpeed);
	
		
	}

}
