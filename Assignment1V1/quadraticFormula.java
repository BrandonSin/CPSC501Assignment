//30012020 Brandon Sin
package files;
import java.util.Scanner;
import java.util.ArrayList;

public class QuadraticFormula {
	
	ArrayList<Double> inputs = new ArrayList<Double>();
	public double ansPositive;
	public double ansNegative;
	
	public void doQuadraticFormula() {
		System.out.println("enter numbers for a, b and c. Type done when finish");
		Scanner scanner = new Scanner(System.in);
		//populate arraylist from user input
		while(scanner.hasNextDouble()) {
			inputs.add(scanner.nextDouble());
		}
		
		//initialize
		try {
		double beginningStep, intermediateStep;
		
		//base formula of quadratic (numerator)
		double step1 = ((inputs.get(1) * inputs.get(1))-4*inputs.get(2)*inputs.get(0));
		//Check if negative number exists in sqroot
		if(step1 < 0){
			System.out.println("Cannot sqroot negative number");
		}
		
		else {
			//quadratic formula when positive
			beginningStep = Math.sqrt(step1);
			intermediateStep = -inputs.get(1) + beginningStep;
			ansPositive = intermediateStep/(2*inputs.get(0));
		
			//quadratic formula when negative
			intermediateStep = -inputs.get(1) - beginningStep;
			ansNegative = intermediateStep/(2*inputs.get(0));
		
			System.out.print("X = " + ansPositive + " or = " + ansNegative);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
