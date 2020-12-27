package subject;

import java.util.Scanner;

public class Jung1523 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int m = sc.nextInt();
		

		for (int i = 0; i < n; i++) {
			
			for (int k = i; k < n-1; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			

			System.out.println();
		}
	}

}
