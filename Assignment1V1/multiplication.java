//30012020 Brandon Sin
package files;
import java.util.Scanner;

public class multiplication {
	
	public int doMultiplication() {
		int product = 1;
		System.out.println("How many numbers are you going to type?:");
		Scanner scanner = new Scanner(System.in);
		int numberSize = scanner.nextInt();
		int numberArray[] = new int[numberSize];
		
		System.out.println("Enter numbers: (ex. 5 2 3)");
		for(int counter = 0; counter < numberSize; counter++) {
			numberArray[counter] = scanner.nextInt();
		}
		scanner.close();
		for (int counter =0; counter < numberSize; counter++) {
			product = numberArray[counter] * product;
		}
		System.out.println(product);
		
		return product;
	}
}
