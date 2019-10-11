//30012020 Brandon Sin
package files;

import java.util.Scanner;
import java.util.ArrayList;

public class averageSpeed {
	
	averageSpeedData data = new averageSpeedData(new ArrayList<Double>(), new ArrayList<Double>());
	addition add = new addition(); //replace inheritance with delegation 
	
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
		add.doAddition(data.distances);
		double totalDistance = add.sum;
		add.doAddition(data.time);
	    double totalTime = add.sum;
		data.avgSpeed = totalDistance / totalTime;
		
	}
	
	public void printAvgSpeed() {
		
		System.out.println("The average speed is: " + data.avgSpeed);
	
		
	}

}
