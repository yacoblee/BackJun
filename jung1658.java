package subject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jung1658 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());

		int arr[] = new int[a];
		int ar[] = new int[b];
		int c = 1;
		int d = 1;
		while (true) {
			for (int i = 1; i < a; i++) {
				if (a % i == 0) {
					arr[c] = i;
					c++;
				}
			}
			for (int i = 1; i < b; i++) {
				if (b % i == 0) {
					ar[d] = i;
					d++;
				}
			}
			if (c >= d) {
				for (int i = 1; i <= c; c++) {
					if (arr[i] == ar[i] && arr[i] > ar[i]) {
						d = arr[i];
					}
				}
				System.out.println(d);
				System.out.println((a * b) / d);
			} else {
				for (int i = 1; i <= d; d++) {
					if (arr[i] == ar[i] && arr[i] > ar[i]) {
						c = arr[i];
					}
				}
				System.out.println(c);
				System.out.println((a * b) / c);
			}
			break;
		}

		bf.close();

	}
}
