package Backjun;

import java.util.Scanner;

public class Back2442 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i =a-1 ; i>=0; i--) {
			
			for(int j = i; j<a-1; j++) {
				System.out.print(" ");
			}
			
			for(int k =0 ; k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
