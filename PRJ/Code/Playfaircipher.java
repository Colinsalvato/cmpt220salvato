import java.awt.Point; //creates points for letters
import java.util.Scanner;

public class Playfaircipher{
	private static char[][] charTable;
	private static Point[] positions;

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		String key = prompt("Enter a key: ", input);
		String jtoi = prompt("Would you like to replace J with I?: ", input);
		String txt = prompt("Enter a message: ", input);

		boolean jandi = jtoi.equalsIgnoreCase("yes");

		createTable(key, jandi);

		String enc = encode(prepareText(txt, jandi));

		System.out.printf("Decoded message:" + decode(enc) + " \n");
		System.out.printf("\nEncoded message:" + enc + "\n");
	}

	private static String prompt(String prompt, Scanner input){
		String s;
		System.out.print(prompt);
		s = input.nextLine().trim();
		return s;
	}


	private static String prepareText(String s, boolean jandi){
		s = s.toLowerCase().replaceAll("[^A-z]", "");
		return jandi ? s.replace("j", "i") : s.replace("q", ""); //replace j with i or omit q
	}

	private static void createTable(String key, boolean jandi){
		charTable = new char[5][5];
		positions = new Point[26];

		String s = prepareText(key + "abcdefghijklmnopqrstuvwxyz", jandi);

		int len = s.length();
		for (int i = 0, k = 0; i < len; i++){
			char c = s.charAt(i);
			if (positions[c - 'a'] == null){
				charTable[k / 5][k % 5] = c;
				positions[c - 'a'] = new Point(k % 5, k / 5);
				k++;
			}
		}
	}

	private static String code(StringBuilder text, int direction){
		int len = text.length();
		for (int i = 0; i < len; i += 2){
			char x = text.charAt(i);
			char y = text.charAt(i + 1);

			int row1 = positions[x - 'a'].y;
			int row2 = positions[y - 'a'].y;
			int col1 = positions[x - 'a'].x;
			int col2 = positions[y - 'a'].x;

			if (row1 == row2){
				col1 = (col1 + direction) % 5;
				col2 = (col2 + direction) % 5; //past 5 in column

			} else if (col1 == col2){
				row1 = (row1 + direction) % 5;
				row2 = (row2 + direction) % 5; //past five in row

			} else {
				int temp = col1;
				col1 = col2;
				col2 = temp;
			}

			text.setCharAt(i, charTable[row1][col1]);
			text.setCharAt(i + 1, charTable[row2][col2]);
		}
		return text.toString();
	}


	private static String encode(String s){
		StringBuilder stringbuilder = new StringBuilder(s);

		for (int i = 0; i < stringbuilder.length(); i += 2){

			if (i == stringbuilder.length() - 1){
				stringbuilder.append(stringbuilder.length() % 2 == 1 ? 'x' : ""); //add 'x' at the end of an odd numbered message
			}
			else if (stringbuilder.charAt(i) == stringbuilder.charAt(i + 1)){
				stringbuilder.insert(i + 1, 'x');
			}
		}
		return code(stringbuilder, 1);
	}


	//decoding an encoded message
	private static String decode(String s){
		return code(new StringBuilder(s), 4);
	}
}