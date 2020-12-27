package subject;

import java.util.Scanner;

public class Jung1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int tmp= 0;
		for(int i = 0; i < arr.length-1; i++) {
			
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					tmp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
							
				}
			}
			for(int k=0; k<arr.length;k++) {
				System.out.print(arr[k]+" ");
			}System.out.println();
		}
		
		
		sc.close();
	}

}
