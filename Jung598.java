import java.util.Scanner;

public class Jung598 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			char c = sc.next().charAt(0);
			if (('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z')) {
				System.out.printf("%c%n", c);

			} else if ('0' <= c && c <= '9') {
				System.out.println((int)c);
				
			}else {
				break;
			}

		}

	}

}
