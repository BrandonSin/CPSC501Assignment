//30012020 Brandon Sin
package files;

import java.util.ArrayList;
import java.util.Scanner;

public class addition {
	

	public double sum;
	ArrayList<Double> inputs = new ArrayList<Double>();
	
	public void userInput() {
	
		System.out.println("Enter numbers: type done when finish");
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextDouble()) {
			inputs.add(scanner.nextDouble());
		}
		scanner.close();
		doAddition(inputs);
	}
		
	public void doAddition(ArrayList<Double> inputs) {

		sum = 0;
		for (int counter =0; counter < inputs.size(); counter++) {
			sum = inputs.get(counter) + sum;
		}
	}
	public void printSum() {
		System.out.println("The Sum is " + sum);
	}

}
