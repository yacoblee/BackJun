package subject;

import java.util.Scanner;

public class Jung1719 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		if ( n>0 && n <= 100 && n % 2 != 0) {
			switch (m) {
			case 1:
				for (int i = 0; i < n; i++) {
					if (i < n / 2 + 1) {
						for (int j = 0; j <= i; j++) {
							System.out.print('*');
						} // 중간까지

//						for(int k =n-i-1; k>=0; k--) {
//							System.out.print(" ");
//						}
					} else {
						for (int j = n - i - 1; j >= 0; j--) {
							System.out.print('*');
						} // 중간이후

					}
					System.out.println();

				}
				break;

			case 2:
				for (int i = 0; i < n; i++) {
					if (i < n / 2 + 1) {
						for (int k = n/2 -i ; k >0; k--) {
							System.out.print(" ");
						}
						for (int j = 0; j <= i; j++) {
							System.out.print('*');
						} //

					} else {
						for (int j = 0; j < i-n/2; j++) {
							System.out.print(' ');
						}

						for (int j = n - i - 1; j >= 0; j--) {
							System.out.print('*');
						}

					}
					System.out.println();

				}
				break;

			case 3:
				for (int i = 0; i < n; i++) {
					if (i < n / 2 + 1) {
						for (int j = 0; j < i; j++) {
							System.out.print(" ");
						}
						for (int j = 0; j < n - (i * 2); j++) {
							System.out.print('*');
						} // 중간까지

						System.out.println();
					} else {
						for (int j = n - i - 1; j > 0; j--) {
							System.out.print(" ");
						}
						for (int j = 0; j <= (i * 2) - n + 1; j++) {
							System.out.print('*');
						}
						System.out.println(); // 중간까지
					}
				}

				break;

			case 4:
				for (int i = 0; i < n; i++) {
					if (i < n / 2 + 1) {
						for (int j = 0; j < i; j++) {
							System.out.print(" ");
						}

						for (int j = n - (n / 2); j > i; j--) {
							System.out.print('*');
						} // 중간까지

					} else {
						for (int j = 0; j < n/2; j++) {
							System.out.print(" ");
						}

						for (int j = n - (n / 2) - 1; j <= i; j++) {
							System.out.print('*');
						} // 중간이후

					}
					System.out.println();

				}
				break;

			default:
				System.out.println("INPUT ERROR!");
				break;
			}
		} else {
			System.out.println("INPUT ERROR!");
		}
	}

}
