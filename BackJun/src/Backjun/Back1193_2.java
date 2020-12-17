package Backjun;

import java.util.Scanner;

public class Back1193_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		boolean flag = false;
		int x = 1;
		int y = 1;
		for (int i = 0; i < num - 1; i++) {
			if (flag) {
				x++;
				y--;
				if (y == 0) {
					flag = false;
					y++;
				}
			} else {
				x--;
				y++;
				if (x == 0) {
					flag = true;
					x++;
				}
			}
		}

		System.out.println(x + "/" + y);

	}
}