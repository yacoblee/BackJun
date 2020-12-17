import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Jung156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[100];
		int a = 0;
		int max = 0;
		int min = 0;
		
		while (true) {

			arr[a++] = sc.nextInt();

			if (arr[a - 1] == 999) {
				break;
			}

		}
		int tmp = 0;
		for(int i =0; i<a; i++) {
			for(int j =0; j<a-1; j++) {
				if(arr[j]>arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= tmp;
				}
			}
		}
		System.out.println("max : " + arr[a - 2]);
		System.out.println("min : " + arr[0]);

	}

}
