

import java.util.Scanner;

public class Jung1314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		char arr[][] = new char[a][a];
		char b = 'A';
		
		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {
				for (int j = 0; j < arr.length; j++) {
					if (b > 'Z') {
						b = 'A';
					}
					arr[j][i] = b;
					b++;
				}
			}
			if (i % 2 == 1) {
				for (int j = arr.length - 1; j >= 0; j--) {
					if (b > 'Z') {
						b = 'A';
					}
					arr[j][i] = b;
					b++;
				}
			}

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
