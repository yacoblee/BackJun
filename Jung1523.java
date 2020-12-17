import java.util.Scanner;

public class Jung1523 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = 0;

		if (m == 1) {
			for (int i = 0; i < n; i++) {
				a++;
				for (int j = 0; j < a; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

		} else if (m == 2) {
			for (int i = 0; i < n; i++) {

				for (int j = n; j >= 0; j--) {

					System.out.print("*");
				}
				System.out.println();
			}

		} else if (m == 3) {

		} else {
			System.out.println("Input Error");
		}

	}

}
