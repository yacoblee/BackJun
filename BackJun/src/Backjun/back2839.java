package subject;

import java.util.Scanner;

public class back2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		sc.close();
		int b = 0;
		int c = 0;

		while (a % 5 != 0 && a >= 0) {
			//3은 최소한 빼기
			a -= 3;
			b++;
		}
		if (a < 0) {
			System.out.println(-1);
		} else { 
			//남은값 5로 나눔
			
			c = a / 5;

			System.out.println(b + c);

		}

	}

}
