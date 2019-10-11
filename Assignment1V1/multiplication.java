//30012020 Brandon Sin
package files;
import java.util.Scanner;
import java.util.ArrayList;
public class multiplication {
	
	ArrayList<Double> inputs = new ArrayList<Double>();
	public double product = 1;
	
	public void doMultiplication() {
		System.out.println("Input numbers to be multiplied. Type done when finish");
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextDouble()) {
			inputs.add(scanner.nextDouble());
		}
		scanner.close();
		for (int counter =0; counter < inputs.size(); counter++) {
			product = inputs.get(counter) * product;
		}
		System.out.println(product);
		
	}
}
