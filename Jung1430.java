package subject;

import java.util.Scanner;

public class Jung1430 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		sc.close();

		int multi = A * B * C;

		String ch = Integer.toString(multi);
		String D[] = ch.split("");
		
		int arr[] = new int[10];

		for (int i = 0; i < D.length; i++) {

			switch (D[i]) {
			case "0":
				arr[0]++;
				break;
			case "1":
				arr[1]++;
				break;
			case "2":
				arr[2]++;
				break;
			case "3":
				arr[3]++;
				break;
			case "4":
				arr[4]++;
				break;
			case "5":
				arr[5]++;
				break;
			case "6":
				arr[6]++;
				break;
			case "7":
				arr[7]++;
				break;
			case "8":
				arr[8]++;
				break;
			case "9":
				arr[9]++;
				break;

			}

		}
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);

		}

	}
}
