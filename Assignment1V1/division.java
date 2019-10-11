//30012020 Brandon Sin
package files;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class division {
	
	public double quotient;
	ArrayList<Double> inputs = new ArrayList<Double>();

	
	public void doDivision() {
		System.out.println("Input numbers for division. Type done when finish");
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextDouble()) {
			inputs.add(scanner.nextDouble());
		}
		scanner.close();
		quotient = inputs.get(0);
		for (int counter =1; counter < inputs.size(); counter++) {
			quotient = quotient / inputs.get(counter);
		}
		System.out.println(quotient);
	}
	
}
