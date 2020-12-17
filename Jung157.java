import java.util.Scanner;

public class Jung157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[100];
		int b = 0;
		int sum = 0;
		int avg = 0;
		int c = 0;

		while (true) {
			arr[b++] = sc.nextInt();

			if (arr[b - 1] == 0) {
				break;
			}

			if (arr[b - 1] % 5 == 0) {
				sum += arr[b - 1];
				c++;
			}

		}
		System.out.println("Multiples of 5 : " + c);
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f" , ((float) sum / (float) c));

	}

}
