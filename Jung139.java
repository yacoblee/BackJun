package subject;

import java.util.Scanner;

public class Jung139 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			if ((a < 2 || a > 9) || (b < 2 || b > 9)) {
				break;
			}
			
			for (int j = 0; j < Math.abs(a - b)+1; j++) { //절대값에 대한 범위로 열지정
				
				if(a>b) {
					System.out.printf("%d * %d = %2d   ",a-j,i,(a-j)*i);
				}
				else if (a<b){
					System.out.printf("%d * %d = %2d   ",a+j,i,(a+j)*i);
				}else {
					System.out.printf("%d * %d = %2d   ",a,i,a*i);
				}
			}System.out.println();

		}

	}

}
