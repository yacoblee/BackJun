package subject;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Jung1697 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> i = new LinkedList<Integer>(); 
		int q = sc.nextInt();

		for (int f = 0; f < q; f++) {
			char c = sc.next().charAt(0);
			switch (c) {
			case 'i':
				int a = sc.nextInt();
				if (a > 10000) {
					return;
				} else {
					i.add(a);
				}
				break;
			case 'o':
				if (i.size() == 0) {
					System.out.println("empty");
				} else {
					System.out.println(i.remove());
				}
				break;
			case 'c':
				System.out.println(i.size());
				break;
			}

		}sc.close();
	}

}
