package subject;

import java.util.Scanner;

public class Jung160 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];
		
		for(int i =0; i<arr.length; i++) {
			char ch = sc.next().charAt(0);
			
				arr[(int)(ch-'0')]++;
			}
		
		for(int i =1; i<arr.length; i++) {
			if(arr[i]>=0&&i<7)
				System.out.println((i)+" : "+arr[i]);
			}
		}
		

	}


