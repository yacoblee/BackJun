import java.util.Scanner;

public class Jung153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[100];
		int i = 0;
		while (true) {

			arr[i++] = sc.nextInt();
			if (arr[i - 1] == -1) {
				break;
			}
		}
		sc.close();
		if (i > 3) {
			for (int j = i - 4; j < i - 1; j++) {
				System.out.print(arr[j] + " ");
			}
		}

		if (i < 4) {
			for (int j = 0; j <= i - 2; j++) {
				System.out.println(arr[j]);
			}
		}
	}
}
