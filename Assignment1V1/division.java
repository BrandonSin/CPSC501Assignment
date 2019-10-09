//30012020 Brandon Sin
package files;
import java.util.Scanner;

public class division {
	
	public int doDivision() {
		System.out.println("How many numbers are you going to type?:");
		Scanner scanner = new Scanner(System.in);
		int numberSize = scanner.nextInt();
		int numberArray[] = new int[numberSize];
		
		System.out.println("Enter numbers: (ex. 5 2 3)");
		for(int counter = 0; counter < numberSize; counter++) {
			numberArray[counter] = scanner.nextInt();
		}
		scanner.close();
		int quotient = numberArray[0];
		for (int counter =1; counter < numberSize; counter++) {
			quotient = quotient / numberArray[counter];
		}
		System.out.println(quotient);
		return quotient;
	}
	
}
