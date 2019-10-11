package files;

import java.util.ArrayList;
import java.util.Scanner;

public class averageSpeedData {
	public double avgSpeed;
	public ArrayList<Double> distances;
	public ArrayList<Double> time;
	public Scanner scanner;

	public averageSpeedData(ArrayList<Double> distances, ArrayList<Double> time) {
		this.distances = distances;
		this.time = time;
	}
}