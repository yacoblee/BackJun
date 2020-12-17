

import java.util.Scanner;

public class Jung565 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		} // 초기화

		while (true) {
			int a = sc.nextInt();

			if (a == 0) {
				break;
			} else {

				arr[(int) a / 10]++;
			}

		}
		sc.close();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println(i + " : " + arr[i]);
			}
		}

	}

}
