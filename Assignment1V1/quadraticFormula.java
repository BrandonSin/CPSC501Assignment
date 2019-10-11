//30012020 Brandon Sin
package files;
import java.util.Scanner;
import java.util.ArrayList;

public class quadraticFormula {
	
	ArrayList<Double> inputs = new ArrayList<Double>();
	public double plus3;
	public double minus3;
	
	public void doQuadraticFormula() {
		System.out.println("enter numbers for a, b and c. Type done when finish");
		Scanner scanner = new Scanner(System.in);
		//populate arraylist from user input
		while(scanner.hasNextDouble()) {
			inputs.add(scanner.nextDouble());
		}
		
		//initialize
		try {
		double plus1, plus2, minus1, minus2;
		
		//base formula of quadratic (numerator)
		double step1 = ((inputs.get(1) * inputs.get(1))-4*inputs.get(2)*inputs.get(0));
		//Check if negative number exists in sqroot
		if(step1 < 0){
			System.out.println("Cannot sqroot negative number");
		}
		
		else {
			//quadratic formula when positive
			plus1 = Math.sqrt(step1);
			plus2 = -inputs.get(1) + plus1;
			plus3 = plus2/(2*inputs.get(0));
		
			//quadratic formula when negative
			minus1 = Math.sqrt(step1);
			minus2 = -inputs.get(1) - minus1;
			minus3 = minus2/(2*inputs.get(0));
		
			System.out.print("X = " + plus3 + " or = " + minus3);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
