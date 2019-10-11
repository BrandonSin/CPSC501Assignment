//30012020 Brandon Sin
package files;
import java.util.ArrayList;
import java.util.Scanner;

public class Subtraction {
	public double difference;
	ArrayList<Double> inputs = new ArrayList<Double>();
	
	//method for taking user's input and subtraction operation
	public void doSubtraction() {
		System.out.println("Enter Numbers to be subtracted? Type done when finish");
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextDouble()) {
			inputs.add(scanner.nextDouble());
		}
		
		scanner.close();
		difference = inputs.get(0);
		for (int counter =1; counter < inputs.size(); counter++) {
			difference = difference - inputs.get(counter);
		}
		System.out.println(difference);
	}

}
