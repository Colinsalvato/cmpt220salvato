import java.util.Scanner;

public class Problem51 {
	public static void main(String[] args) {
		int pos = 0;
		int neg = 0;
		int tot = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print(
				"Enter an integer  (the input ends if it is 0): ");
		int data = input.nextInt();
		
		int sum = 0;
		while(data !=0){
			sum += data;
			
			System.out.println("The sum is " + sum);
			if (data >= 0){
				pos++;
				tot++;
			}
			else{
				neg++;
				tot++;
			}
			
			System.out.print("Enter an integer (the input ends of it is 0): ");
			data = input.nextInt();
			
		}
		
		System.out.println("The number of negatives is " + neg);
		System.out.println("The number of positives is " + pos);
		System.out.println("The average is " + (sum/tot));
	}
}

