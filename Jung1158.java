package subject;

import java.util.Scanner;

public class Jung1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int min;
		int tmp;

		int data[] = new int[size];

		for (int i = 0; i < size; i++) {
			data[i] = sc.nextInt();
//			System.out.print(data[i]);
		}

		for (int i = 0; i < size; i++) {
			
			for (int j = 1; j <= i; j++) {
				if (data[j] > data[i]) {
					
					
					tmp = data[j];
					min = data[j];
					data[i] = tmp;
				}
			}
			
			for (int k = 0; k < size; k++) {
				System.out.print(data[k] + " ");
			}
			System.out.println();

		}

		sc.close();
	}

}
