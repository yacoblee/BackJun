

import java.util.Scanner;

public class Jung167 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[4][2];

		for (int i = 0; i < arr.length; i++) {

			int sum = 0;

			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = sc.nextInt();
				sum += arr[i][j];
			}
			System.out.print(sum / 2 + " ");
		}
		System.out.println();
		sc.close();

		int sum = 0;
		int sum2 = 0;
		int sum3 =0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum3 +=arr[i][j];

			}
			sum += arr[i][0];
			sum2 +=arr[i][1];
		}
		System.out.println(sum/4+" "+sum2/4);
		System.out.println(sum3/8);
	}
	

}
