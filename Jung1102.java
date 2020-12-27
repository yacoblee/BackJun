package subject;

import java.util.Scanner;
import java.util.Stack;

public class Jung1102 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack<Integer> i = new Stack<Integer>();
		int q = sc.nextInt();

		for (int f = 0; f < q; f++) {
			char c = sc.next().charAt(0);
			switch (c) {
			case 'i':
				int a = sc.nextInt();
				if (a > 10000) {
					return;
				} else {
					i.push(a);
				}
				break;
			case 'o':
				if (i.size() == 0) {
					System.out.println("empty");
				} else {
					System.out.println(i.pop());
				}
				break;
			case 'c':
				System.out.println(i.size());
				break;
			}

		}
		sc.close();
	}

}
