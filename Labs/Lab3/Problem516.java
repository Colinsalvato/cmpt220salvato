import java.util.Scanner;

public class Problem516 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int data = input.nextInt();
		for(int i = 2; i < data; i++){
			if ((data%i)==0){
				System.out.print(i + ", ");
			}
		}

	}

}
