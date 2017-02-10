import java.util.Scanner;

// JA: Add comments to your code
// JA: 1 Kilogram = 2.20462 Pound
// JA: 1 Pound = 0.453592 Kilogram
// JA: There were two tables side by side, one kilograms to pounds, in increments of 2
// JA: the other pounds to kilograms in increments of 5
public class Problem55 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kilograms   Pounds");
		for(double i = 0.0; i <= 100; i++ ){
		System.out.println(i + "        " + (i*2.2));
			
		}
	}

}
