package subject;

import java.util.Scanner;

public class jung1338 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int s = 65;
		char arr[][] = new char[a][a];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				arr[i][j] = ' ';
			}

		}


		for (int k = 0; k < a; k++) {
			for (int i = 0; k + i < a; i++) {

				if (s > 90)
					s = 65;

				arr[k + i][a - 1 - i] = (char) (s);
				s++;

			}
			
		}

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

//		}

		sc.close();

	}

}
