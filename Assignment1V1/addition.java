//30012020 Brandon Sin
package files;

import java.util.Scanner;

public class addition {
	

	public int sum;
	public int numberSize;
	public int numberArray[];
	Scanner scanner;
	
	public void userInput() {
		System.out.println("How many numbers are you going to type?:");
		scanner = new Scanner(System.in);
		numberSize = scanner.nextInt();
		numberArray = new int[numberSize];
		System.out.println("Enter numbers: (ex. 5 2 3)");
		
		for(int counter = 0; counter < numberSize; counter++) {
			numberArray[counter] = scanner.nextInt();
		}
		
		scanner.close();
		
		doAddition(numberSize, numberArray);
		
	}
		
	public void doAddition(int numberSize, int numberArray[]) {

		sum = 0;
		for (int counter =0; counter < numberSize; counter++) {
			sum = numberArray[counter] + sum;
		}
	}
	public void printSum() {
		System.out.println("The Sum is " + sum);
	}

}
