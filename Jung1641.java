import java.util.Scanner;

public class Jung1641 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		
		
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j <= i; j++) {
					num++;
					System.out.print(num + " ");
				}
				System.out.println();
			} else {
				for (int j = i; j >= 0; j--) {
					num++;
					System.out.print(num + " ");
				}
				System.out.println();
			}
		}

//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//
//			}
//		}

	}

}
