import java.util.Scanner;

public class Problem420 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		String s = input.nextLine();
		System.out.println(s + "'s length is " + s.length() + " and the first letter is " + s.charAt(0));
		
	}

}
