package subject;

import java.util.Scanner;

public class Jung600 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String a[] = word.split(" ");

		int c = 1;

		for (int i = 0; i < word.length(); i++) {

			if (word.charAt(i)==' ') {
				c++;

			} 
		}
		System.out.print(c);
		sc.close();

	}

}
