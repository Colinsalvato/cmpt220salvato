// JA: Add comments to your code
public class Problem616 {

	public static void main(String[] args) {
		int i = 2016; // You had to print all the years from 200 to 2020
		
		if(numberOfDaysInAYear(i) == true){
			System.out.println("There are 366 days in " + i);
		}
		else{
			System.out.println("There are 365 days in " + i);
		}
	}
	public static boolean numberOfDaysInAYear(int year){
		return year % 400==0|| ( year %  4 == 0 && year % 100 != 0);
	}
}
