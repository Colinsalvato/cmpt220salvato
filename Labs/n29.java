import java.util.Scanner;
public class n29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		double v0 = scanner.nextDouble();

		double v1 = scanner.nextDouble();

		double t = scanner.nextDouble();

		System.out.println( " The average acceleration is" + ( v1 - v0 ) / t );
	}

}
