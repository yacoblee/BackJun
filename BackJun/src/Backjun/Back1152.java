package Backjun;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Back1152 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		StringTokenizer at =new StringTokenizer(str," ");
		System.out.println(at.countTokens());
		
		
		
	}

}
