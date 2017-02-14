
public class Problem616 {

	public static void main(String[] args) {
		int i = 2016;
		
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
