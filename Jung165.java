

import java.util.Scanner;

public class Jung165 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[5][5];

		for (int i = 0; i < arr.length - 1; i++) {
			arr[0][0] = 1;
			arr[0][2] = 1;
			arr[0][4] = 1;
		}

		for (int i = 1; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				if (i == 1) {
					arr[i][1] = arr[0][0] + arr[0][2];
					arr[i][3] = arr[0][0] + arr[0][4];
				} else if (i == 2) {
					arr[i][0] = arr[1][1];
					arr[i][2] = arr[1][1] + arr[1][3];
					arr[i][4] = arr[1][3];

				} else if (i == 3) {
					arr[i][1] = arr[2][0] + arr[2][2];
					arr[i][3] = arr[2][2] + arr[2][4];
				} else {
					arr[i][0] = arr[3][1];
					arr[i][2] = arr[3][1] + arr[3][3];
					arr[i][4] = arr[3][3];
				}
			}

		}
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");

			}System.out.println();
		}

	}

}
