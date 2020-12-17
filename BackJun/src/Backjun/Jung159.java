package Backjun;

import java.util.Scanner;

public class Jung159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

		sc.close();

		print(arr);

	}

	public static void print(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			int tmp = 0;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] < arr[j + 1]) {

					tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;

				} else {
					continue;
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
