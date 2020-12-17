
import java.util.*;

public class Jung560 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr [] =  new int [10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[0]);

	}

}
