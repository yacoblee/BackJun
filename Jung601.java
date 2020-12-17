

import java.util.Scanner;

public class Jung601 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String s2=str;

		for (int i = 0; i < str.length(); i++) {
		char at = s2.charAt(str.length()-1);
		s2= at+s2.substring(0, str.length()-1);
		
		System.out.println(s2);
	}
	}

}
