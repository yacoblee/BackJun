import java.util.Scanner;

public class Jung599 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		String b = a.toUpperCase();

		char ch[] = b.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] > 64 && ch[i] < 91) {
				System.out.print(ch[i]);
			}

		}

	}

}
