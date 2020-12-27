package subject;

import java.util.Scanner;

public class Jung569 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[5][4];
		int[] sum = new int[5];
		int avg = 0;
		int a = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();

				sum[i] += arr[i][j];

			}
			

		}
		for (int i = 0; i < sum.length; i++) {
			avg = sum[i] / 4;
			if (avg >= 80) {
				System.out.println("pass");
				a++;
			} else {
				System.out.println("fail");
			}
		}
		System.out.println("Successful : " + a);
	}
}
