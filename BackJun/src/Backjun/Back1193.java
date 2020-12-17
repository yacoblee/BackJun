package Backjun;

import java.util.Scanner;

public class Back1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int c = 0;
		int tmp = a;

		while (tmp > 0) {
			c++;
			tmp -= c;
		}
		tmp = tmp + c;
		if ((c + 1) % 2 == 0) {
			System.out.println((c + 1 - tmp) + "/" + tmp);
		} else {
			System.out.println(tmp + "/" + (c + 1 - tmp));
		}

	}
}
