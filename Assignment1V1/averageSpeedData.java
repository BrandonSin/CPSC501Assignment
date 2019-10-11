package files;

import java.util.ArrayList;
import java.util.Scanner;
//class for storing data for average speed
public class AverageSpeedData {
	public double avgSpeed;
	public ArrayList<Double> distances;
	public ArrayList<Double> time;
	public Scanner scanner;

	public AverageSpeedData(ArrayList<Double> distances, ArrayList<Double> time) {
		this.distances = distances;
		this.time = time;
	}
}