

import java.util.Scanner;

public class Jung161 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[11];

		while (true) {
			int num = sc.nextInt();

			if (num == 0) {
				break;
			}
			arr[(int) num / 10]++;
		}

		for (int i = 10; i >= 0; i--) {
			if (arr[i] > 0) {
				System.out.println((int) (i * 10) + " : " + arr[i] + " person");
			}
		}

	}

}
