import java.util.Scanner;
public class Problem72 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 10 integers: ");
		for(int i = 0; i<10; i++){
			numbers[i] = input.nextInt();
		}
		for(int i = 9; i>=0; i--){
			System.out.println(numbers[i]);
		}
	}

}
