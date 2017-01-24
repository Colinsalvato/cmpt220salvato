import java.util.Scanner;

public class n26 {
	public static void main(String[] args) {
		
	
	System.out.println("Enter a 3 digit number.");
	
	Scanner scanner = new Scanner(System.in);
	int i = scanner.nextInt();

	int j1 = i%10;
	int j2 = (i/10)%10;
	int j3 = i/100;
	System.out.println(j1 + j2 + j3);
}
}