import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Jung187 {

	public static void main(String[] args) throws IOException {
		BufferedReader sc2 = new BufferedReader(new InputStreamReader(System.in));

		String s = sc2.readLine();
		StringBuffer str = new StringBuffer(s);

		while (true) {

			if (str.length() == 1||str.length()>=100) {
				break;
			}
			int a = Integer.parseInt(sc2.readLine());

			if (str.length() <= a) {
				str = str.deleteCharAt(str.length() - 1);
				System.out.println(str);
			} else {
				str = str.deleteCharAt(a - 1);
				System.out.println(str);
			}

		}
		sc2.close();

	}

}
