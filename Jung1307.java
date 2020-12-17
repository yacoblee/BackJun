

import java.util.Scanner;

public class Jung1307 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int b = sc.nextInt();
		char arr[][] = new char[b][b];

		char a = 'A';
		for (int i = b-1 ; i >= 0; i--) {
			for (int j = b-1 ; j >= 0; j--) {
				if(a>'Z') {
					a= 'A';
				}

				arr[j][i] = a;
				a++;
				
			}
		}

		for (int i = 0; i < b; i++) {

			for (int j = 0; j < b; j++) {

				System.out.print(arr[i][j]+" ");

			}
			System.out.println();
		}

	}

}
