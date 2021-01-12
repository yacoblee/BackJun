package subject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;


public class back10845 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		ArrayList<Integer> i = new ArrayList<Integer>();

		int q = Integer.parseInt(bf.readLine());
		
		for (int f = 0; f < q; f++) {
			
			String []c = bf.readLine().split(" ");

			switch (c[0]) {
			case ("push"):

				i.add(Integer.parseInt(c[1]));
				break;
			case ("pop"):
				if (i.isEmpty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write(i.remove(0)+ "\n");
				}
				break;
			case ("size"):
				bw.write(i.size()+ "\n");
				break;
			case "empty": // 비어있으면1 아니면0
				if (i.isEmpty()) {
					bw.write("1" + "\n");
				} else {
					bw.write("0" + "\n");
				}
				break;
			case ("front"):
				if (i.isEmpty()) {
					bw.write("-1" + "\n");
				} else
					bw.write(i.get(0) + "\n");

				break;
			case ("back"):
				if (i.isEmpty()) {
					bw.write("-1" + "\n");
					
				} else
					bw.write(i.get(i.size() - 1) + "\n");
				
			break;
			}

		}
		bw.flush();
		bw.close();
	
	}

}
