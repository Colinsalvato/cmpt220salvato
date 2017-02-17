import java.util.Scanner;
/// JA: Add comments to your code
public class Problem74 {

	static final int MAX = 100;
	
	public static void main(String[] args) {
		int[] scores = new int[MAX];
		 int numOfScores = 0;
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter the scores: ");
	        for (int i = 0; i < MAX; i++) {
	        	int num = input.nextInt();

	            if (num < 0)  break;

	            scores[i] = num;
	            numOfScores++;
	        }
	        
	        
	        scores[numOfScores] = -1; 
	        int average = getAverage(scores, numOfScores);
	        int aboveAndEqual = scoresAboveAndEqualToAverage(scores, average);

	        System.out.println("# of scores: " + numOfScores);
	        System.out.println("Average: " + average);
	        System.out.println("Above average" + aboveAndEqual);
	        System.out.println("Below average " + (numOfScores - aboveAndEqual));

	    }

	    public static int getAverage(int[] scores, int numberOfScores) {
	        int total = 0;
	        for (int i = 0; scores[i] >= 0; i++) {
	            total += scores[i];
	        }

	        return total / numberOfScores; // JA: This has to be a non-integer division
	    }

	    public static int scoresAboveAndEqualToAverage(int[] scores, int average) {
	        int count = 0;
	        for (int i = 0; scores[i] >= 0; i++) {

	            if (scores[i] >= average) count++;
	        }

	        return count;
	    }
	  
	}
