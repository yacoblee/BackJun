

import java.util.Scanner;

public class Jung1291 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		while (((num1 < 2 || num2 < 2) || (num1 > 9 || num2 > 9))) {
			System.out.println("INPUT ERROR!");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
		} //해당부분 질문 내부에서 입력하고서 왜 위로 올라가는지

		if (num1 >= num2) {
			for (int i = 1; i <= 9; i++) {
				for (int j = num1; j >= num2; j--) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);
				}
				System.out.println();
			}
		} else {

			for (int i = 1; i <= 9; i++) {
				for (int j = num1; j <= num2; j++) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);

				}
				System.out.println();
			}

		}

	}

}
