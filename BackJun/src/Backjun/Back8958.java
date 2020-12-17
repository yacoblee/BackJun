package Backjun;

import java.util.Scanner;

public class Back8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = 0;
		int sum = 0;

		for (int i = 0; i < a; i++) {

			String s = sc.next();

			b = 0;
			sum = 0;
			for (int j = 0; j < s.length(); j++) {

				if (s.charAt(j) == 'O') {
					b++;
					sum += b;
				} else if (s.charAt(j) == 'X') {
					b = 0;

				}
			}
			System.out.println(sum);
		}

	}

}
