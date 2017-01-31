	import java.util.Scanner;
public class Problem35 {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a day: ");
			int day = input.nextInt();
			
			System.out.print("Enter how many days after today you'd like to know: ");
			int daysPast = input.nextInt();
			
			System.out.print(daysPast + " days past ");
			
			switch(day % 7){
			case 0: System.out.print("Sunday"); break;
			case 1: System.out.print("Monday"); break;
			case 2: System.out.print("Tuesday"); break;
			case 3: System.out.print("Wednesday"); break;
			case 4: System.out.print("Thursday"); break;
			case 5: System.out.print("Friday"); break;
			case 6: System.out.print("Saturday");
			}
			System.out.print( " is " );
			switch((day + daysPast) % 7){
			case 0: System.out.print("Sunday"); break;
			case 1: System.out.print("Monday"); break;
			case 2: System.out.print("Tuesday"); break;
			case 3: System.out.print("Wednesday"); break;
			case 4: System.out.print("Thursday"); break;
			case 5: System.out.print("Friday"); break;
			case 6: System.out.print("Saturday");
			}
		}
}