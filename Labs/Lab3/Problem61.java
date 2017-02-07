public class Problem61 {
	public static void main(String[] args) {
		
		for(int i = 1; i < 101; i++){
			System.out.print(displayPattern(i) + ", ");
			if(i%10==0){
				System.out.println("");
			}
		}
		
	}
	
	public static int displayPattern(int n){
		int x = (n*((3*n)-1)/2);
		return x;
	}
	
}

