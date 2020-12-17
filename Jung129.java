import java.util.Scanner;

public class Jung129 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Base = ");
			int ba = sc.nextInt();
			System.out.print("Height = ");
			int he = sc.nextInt();
			System.out.printf("Triangle width = %.1f%n", ((float) ba * (float) he) / 2);
			System.out.print("Continue? ");
			char a = sc.next().charAt(0);

			if (a == 'Y' || a == 'y') {

				continue;
			}

			else  {
				break;
			}

		}
		sc.close();
	}

}
