package subject;

import java.util.Scanner;

public class jung1071 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if (n < 1 || n > 40) {
			return;
		}
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int a = 0;
		int b = 0;
		int c = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (c % arr[i] == 0) {
				a += arr[i];
			}
			if (arr[i] >= c) {
				if (arr[i] % c == 0) {
					b += arr[i];
				}
			}
		}
		System.out.println(a);
		System.out.println(b);
		sc.close();
	}

}
