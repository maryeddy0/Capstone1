import java.util.Scanner;

public class Capstone1 {
	private static char b;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("WELCOME TO THE PIG LATIN TRANSLATOR");
		String play = null;

		do {
			// Enter a word
			System.out.println("Enter a word");
			String word = scan.next();
			word = word.toLowerCase();
			int length = word.length();

			String latin = pigWord(word);
			String out = latin.toLowerCase();
			System.out.println(latin);

			System.out.println("Enter another Line? y/n");
			play = scan.next();
		} while (play.equalsIgnoreCase("y"));
		System.out.println("Goodbye.");
	}
	private static String pigWord(String word) {
		int split = firstVowel(word);
			return word.substring(split) + word.substring(0, split) + "ay";
	}
	private static int firstVowel(String word) {
		for (int i = 0; i < word.length(); i++)
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u')
				return i;
		return 0;
}
	
		}
		

