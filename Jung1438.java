package subject;

import java.util.Scanner;

public class Jung1438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[100][100];
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = 0;
			}
		}
		// 0으로 초기화
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int wid = sc.nextInt();
			int hei = sc.nextInt();
			for (int j = wid; j < wid + 10; j++) {
				for (int k = hei; k < hei + 10; k++) {

					arr[j][k] = 1;
				}
			}

		}//곂치는 부분 포함 1씩 대입
		sc.close();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == 1) {
					a++;
				}
			}
		}
		// 값 1 만 넣기
		System.out.println(a);

	}

}
