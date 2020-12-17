import java.util.Scanner;

public class Jung611 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String st = sc.nextLine();

		int idx = st.indexOf(".");
		String a = st.substring(0, idx+1);

		float c = Float.valueOf(a);

		System.out.println((int) (c) * 2);

		System.out.printf("%.2f", c);

	}

}
