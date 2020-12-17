import java.util.Scanner;

public class Jung2046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		switch (m) {
		case 1:
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(i + 1 + " ");
				}
				System.out.println();
			}
			break;

		case 2:
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					for (int j = 0; j < n; j++) {
						System.out.print(j + 1 + " ");
					}
				} else {
					for (int j = n; j > 0; j--) {
						System.out.print(j + " ");
					}
				}
				System.out.println();
			}
			break;

		case 3:
			for (int i = 0; i < n; i++) {

				for (int j = 0; j < n; j++) {
					System.out.print((i + 1) * (j + 1) + " ");
				}
				System.out.println();
			}

			break;

		}
		sc.close();

	}

}
