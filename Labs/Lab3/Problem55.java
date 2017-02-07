import java.util.Scanner;

public class Problem55 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kilograms   Pounds");
		for(double i = 0.0; i <= 100; i++ ){
		System.out.println(i + "        " + (i*2.2));
			
		}
	}

}
