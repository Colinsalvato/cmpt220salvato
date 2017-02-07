
public class Problem63 {

	public static void main(String[] args) {
		System.out.print(reverse(564));
		System.out.print(isPalindrome(564));
		System.out.print(isPalindrome(565));
	}
	public static int reverse(int number){
		int reverseNum = 0;
		while(number !=0){
		reverseNum = reverseNum*10;
		reverseNum = reverseNum + number%10;
		number = number/10;
		}
		return(reverseNum);
	}
	public static boolean isPalindrome(int number){
		return(number == reverse(number));
	}
}
