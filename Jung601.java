package subject;

import java.util.Scanner;

public class Jung601 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			char tmp = str.charAt((str.length()-1));
			str=tmp+str.substring(0, str.length()-1);
		System.out.println(str);
		}
	}

}
