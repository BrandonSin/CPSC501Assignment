//30012020 Brandon Sin
package files;
import java.util.Scanner;

public class quadraticFormula {
	
	public void doQuadraticFormula() {
		System.out.println("enter numbers for a, b and c");
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[3];
		for (int counter = 0; counter <= 2; counter++) {
			array[counter] = scanner.nextInt();
		}
		try {
		double plus1, plus2, plus3, minus1, minus2, minus3;
		
		if((array[1] * array[1])-4*array[0]*array[2] < 0){
			System.out.println("Cannot sqroot negative number, Terminate program");
			System.exit(0);
		}
		else {
			plus1 = Math.sqrt((array[1] * array[1])-4*array[0]*array[2]);
			plus2 = -array[1] + plus1;
			plus3 = plus2/(2*array[0]);
		
			minus1 = Math.sqrt((array[1] * array[1])-4*array[0]*array[2]);
			minus2 = -array[1] - minus1;
			minus3 = minus2/(2*array[0]);
		
			System.out.print("X = " + plus3 + " or = " + minus3);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
