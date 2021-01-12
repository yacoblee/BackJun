package subject;

import java.util.Scanner;

public class Jung1641 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		// 크기
		if (n > 100 || n < 1 || n % 2 == 0) {
			System.out.println("INPUT ERROR!");
			return;
		} // 조건문
		int sel = sc.nextInt();
		// 종류
		int size = 2 * n - 1;
		int[][] arr = new int[n][size];
		//case 1에서 사용
		
		
		
		
		switch (sel) {
		case 1:
			int num = 1;

			for (int i = 0; i < n; i++) {

				if (i % 2 == 0) {

					for (int j = 0; j <= i; j++)
						arr[i][j] = num++;
				} else {
					for (int j = i; j >= 0; j--)
						arr[i][j] = num++;
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (arr[i][j] == 0)
						System.out.print("");
					else
						System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			break;
		case 2:

			for (int i = 0; i < n; i++) {

				for (int j = 0; j < i; j++)
					System.out.print("  ");

				for (int j = 0; j < size - (2 * i); j++)
					System.out.print(i + " ");

				System.out.println();
			}
			break;
		case 3:
			int max = n / 2 + 1;

			for (int i = 0; i < max; i++) {

				for (int j = 0; j <= i; j++)
					System.out.print(j + 1+" ");

				System.out.println();
			}

			for (int i = max; i > 1; i--) {

				for (int j = 1; j < i; j++)
					System.out.print(j+" ");

				System.out.println();
			}

			break;
			
		default:
			System.out.println("INPUT ERROR!");
			break;
		}
		sc.close();
		
	}
}
