//30012020 Brandon Sin
package files;

import java.util.Scanner;
import java.util.ArrayList;

public class averageSpeed extends addition{
	
	averageSpeedData data = new averageSpeedData(new ArrayList<Double>(), new ArrayList<Double>());

	public void calcDistance() {
		System.out.println("What are all the distances? type done when finish");
		data.scanner = new Scanner(System.in);
		while(data.scanner.hasNextDouble()) {
			data.distances.add(data.scanner.nextDouble());
		}
	
		
	}
	public void calcTime() {
		System.out.println("What are the times? type done when finish");
		data.scanner = new Scanner(System.in);
		while(data.scanner.hasNextLine()) {
			if(data.scanner.hasNextDouble()) {
				data.time.add(data.scanner.nextDouble());
			}
			else {
				break;
			}
		}
		data.scanner.close();
		
	}
	
	public void doAverageSpeed() {
		doAddition(data.distances);
		double totalDistance = super.sum;
		doAddition(data.time);
	    double totalTime = super.sum;
		data.avgSpeed = totalDistance / totalTime;
		
	}
	
	public void printAvgSpeed() {
		
		System.out.println("The average speed is: " + data.avgSpeed);
	
		
	}

}
