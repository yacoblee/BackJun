

import java.util.Scanner;

public class Jung564 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}//초기화

		while (true) {
			char in = sc.next().charAt(0);

			if ('A' <= in && in <= 'Z') {
				arr[(int) (in - 'A')]++;
			} else {
				break;
			}

		}

		sc.close();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println((char) (i + 'A') + " : " + arr[i]);
			}
		}
		

	}

}
