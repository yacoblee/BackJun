package subject;

import java.util.Scanner;

public class Jung612 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String c = "";
		int[] ar = new int[5];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();

		}
		for (int i = 0; i < ar.length; i++) {
			String b = Integer.toString(ar[i]);
			c += b;
		}

		for (int i = 0; i < c.length(); i++) {
			if (i % 3 == 0 && i!=0) {
				System.out.println();
			}
			System.out.print(c.charAt(i));
		}
		sc.close();

	}

}
