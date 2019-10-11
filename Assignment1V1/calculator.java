//30012020 Brandon Sin 
package files;
 import java.util.*;
 

public class Calculator {
	//main class for switching on operations
	public static void main(String[] args) {
		System.out.println("Choose which operation to perform: Press the corresponding number\n" + "Multiplication: 0\nAddition: 1"
				+ "\nSubtraction: 2\nDivision: 3\nQuadratic Equation: 4\nAverages: 5 \nAverage Speed: 6");
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		
		
		try {
			switch (choice) {
				
			case "0": 
				Multiplication multi = new Multiplication();
				multi.doMultiplication();
				break;
				
			case "1":
				Addition add = new Addition();
				add.userInput();
				add.printSum();
				break;
				
			case "2":
				Subtraction sub = new Subtraction();
				sub.doSubtraction(); 
				break;
				
			case "3":
				Division div = new Division();
				div.doDivision();
				break;
				
			case "4":
				QuadraticFormula quad = new QuadraticFormula();
				quad.doQuadraticFormula(); 
				break;
			
			case "5":
				Average avg = new Average();
				avg.doAverage();
				avg.printAvg();
				break;
				
			case "6":
				AverageSpeed avgSpeed = new AverageSpeed();
				avgSpeed.calcDistance();
				avgSpeed.calcTime();
				avgSpeed.printAvgSpeed();
				break;
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
