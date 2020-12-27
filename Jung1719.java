package subject;

import java.util.Scanner;

public class Jung1719 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		if (n <= 100 && n % 2 != 0) {
			switch (m) {
			case 1:
				for (int i = 0; i < n; i++) {
					if(i<n/2+1) {
						for(int j =0; j<=i; j++) {
							System.out.print('*');
						} // 증감식
						
						for(int k =n-i-1; k>=0; k--) {
							System.out.print(" ");
						}
					}
					else {
						for(int j =n-i-1; j>=0; j--) {
							System.out.print('*');
						}//감소식
						
					}System.out.println();
				
				}
				break;
				
			case 2:
				for (int i = 0; i < n; i++) {
					if(i<n/2+1) {
						for(int k =n-i-1; k>=0; k--) {
							System.out.print(" ");
						}
						for(int j =0; j<=i; j++) {
							System.out.print('*');
						} // 증감식
						
					}
					else {
						for(int j =0; j<=i; j++) {
							System.out.print(' ');
						} // 증감식
						
						for(int j =n-i-1; j>=0; j--) {
							System.out.print('*');
						}//감소식
						
					}System.out.println();
				
				}
				break;
				
			case 3:
				for(int i =0; i<0; i++) {
					
				}
				
				break;
				
			case 4:
				
				break;
				
			default:
				break;
			}
		}else {
			System.out.println("INPUT ERROR!");
		}
	}

}
