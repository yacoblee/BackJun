package subject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back10872 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int b = 1;
		br.close();
//		if (0 <= a && a <= 12) {
		while (true) {
			if(a==0) {
				System.out.println(1);
			}
			for (int i = 1; i <= a; i++) {
				b = i * b;

				if (i == a) {
					System.out.println(b);
				}

			}
			break;
		}
//		else {
//			continue;
//		}
	}
}
