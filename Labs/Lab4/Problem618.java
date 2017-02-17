import java.util.Scanner;
// JA: Add comments to your code
public class Problem618 {

	private static final int PASSWORD_REQUIRED_LENGTH = 0; // JA: This was supposed to be 8
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a Password ");
	String s = input.nextLine();
	
	if (isValidPassword(s)){
		System.out.println(s + " is a valid password.");
	}
	else{
		System.out.println(s + " is not a valid password.");
	}
	}
	public static boolean isValidPassword(String password){
		
		if(password.length() < PASSWORD_REQUIRED_LENGTH){
			return false;
		}
		
		int charCount = 0;
		int numCount = 0;
		for(int i = 0; i < password.length(); i++){
			char ch = password.charAt(i);
			
			if ( isNumeric(ch)) numCount++;
			else if(isLetter(ch)) charCount++;
			else return false;
		}
		return (charCount >= 2 && numCount >= 2);
	}
	public static boolean isLetter(char ch){
		ch = Character.toUpperCase(ch);
		return(ch >= 'A' && ch <='Z');
	}
	public static boolean isNumeric(char ch){
		return (ch >= '0' && ch<= '9');
	}
}
