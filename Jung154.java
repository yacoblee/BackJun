package subject;

import java.util.Scanner;

public class Jung154 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float arr[] = new float[6];
		float sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextFloat();
			sum += arr[i];

		}
		System.out.printf("%.1f", sum / (float) 6);

	}

}
