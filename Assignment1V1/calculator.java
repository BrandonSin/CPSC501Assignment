//30012020 Brandon Sin 
package files;
 import java.util.*;
 

public class calculator {
	public static void main(String[] args) {
		System.out.println("Choose which operation to perform: Press the corresponding number\n" + "Multiplication: 0\nAddition: 1"
				+ "\nSubtraction: 2\nDivision: 3\nQuadratic Equation: 4\nAverages: 5 \nAverage Speed: 6");
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		
		
		try {
			if(choice.equals("0")) {
				multiplication multi = new multiplication();
				multi.doMultiplication();
				
			}
			if(choice.equals("1")) {
				addition add = new addition();
				add.userInput();
				add.printSum();
			
			}
			if(choice.equals("2")) {
				subtraction sub = new subtraction();
				sub.doSubtraction();
			}
			if(choice.equals("3")) {
				division div = new division();
				div.doDivision();
			}
			
			if(choice.equals("4")) {
				quadraticFormula quad = new quadraticFormula();
				quad.doQuadraticFormula(); 
	
	
			}
			if(choice.equals("5")) {
				average avg = new average();
				avg.doAverage();
				avg.printAvg();
	
			}
			if(choice.equals("6")) {
				averageSpeed avgSpeed = new averageSpeed();
				avgSpeed.calcDistance();
				avgSpeed.calcTime();
				avgSpeed.doAverageSpeed();
				avgSpeed.printAvgSpeed();
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
