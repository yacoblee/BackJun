package subject;

import java.util.Scanner;

public class Jung190 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String arr[] = {"flower", "rose", "lily", "daffodil", "azalea"} ;
		 
		 char a = sc.next().charAt(0);
		 int b =0;
		 sc.close();
		 for(int i=0; i<arr.length; i++) {
			 if(arr[i].charAt(1)==a||arr[i].charAt(2)==a) {
				 System.out.println(arr[i]);
				 b++;
			 }
		 }
		 System.out.println(b);

	}

}
