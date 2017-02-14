
public class Problem612 {

	public static void main(String[] args) {
		final int NUMBER_CHARS_PER_LINE = 10;
		char n1 = '1';
		char n2 = 'z';
		
		System.out.println("Chars per 1 to z");
		printChars(n1, n2, NUMBER_CHARS_PER_LINE);
		System.out.println();

	}
	
	public static void printChars(char n1, char n2,int numberPerLine){
		for (char c = n1, count =1; c <=n2; c++, count++){
			if(count % numberPerLine ==0){
				System.out.println(c);
			}
			else{
				System.out.print(c);
			}
		}
	}

}
