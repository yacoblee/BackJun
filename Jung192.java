package subject;

import java.util.*;

public class Jung192 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tmp;
		
		int a = sc.nextInt();
		String arr[] = new String[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.next();
		}

		for (int i = 0; i < a - 1; i++) {

			for (int j = i + 1; j < a; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {

					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] =tmp;
				}
			}
		}
		
		for(int i =0;i<a;i++) {
			System.out.println(arr[i]);
		}

	}

}
