import java.util.Scanner;

public class Problem32{
	public static void main(String[] args){
		int number1 = (int)(Math.random()*10); //Generate number 1
		int number2 = (int)(Math.random()*10); //Generate number 2
		int number3 = (int)(Math.random()*10); //Generate number 3
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(
				"What is " + number1 + " + " + number2 + " + " + number3 + "? ");
		
		int answer = input.nextInt();
				System.out.println(number1 + " + " + number2 + " + " + number3 + " is " + (number1 + number2 + number3 == answer));

	}

}
