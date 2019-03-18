/*
ID: jmassoni1
LANG: JAVA
TASK: gift1
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Math.abs;
import java.util.*;

public class gift1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
		// input file name goes above
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
		// Use StringTokenizer vs. readLine/split -- lots faster
		StringTokenizer st = new StringTokenizer(f.readLine());
		Scanner in = new Scanner(System.in);

		int numberOfGroup = Integer.parseInt(st.nextToken());

		LinkedHashMap<String, Integer> friends = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < numberOfGroup; i++) {
			friends.put(st.nextToken(), 0);
		}

		String temp = st.nextToken();
		int amount = -(Integer.parseInt(st.nextToken()));
		int gifts = Integer.parseInt(st.nextToken());
		int count = 0;

		while (true) {

			if (count > 0) {
				temp = st.nextToken();
				amount = -(Integer.parseInt(st.nextToken()));
				gifts = Integer.parseInt(st.nextToken());
			}

			if (amount == 0 && gifts == 0) {
				continue;
			}
			else {

				if (friends.containsKey(temp)) {
					friends.put(temp, amount + friends.get(temp));
				}

				int sum = abs(amount / gifts);
				int remainder = abs(amount % gifts);
				if (remainder != 0) {
					friends.put(temp, friends.get(temp) + remainder);
				}

				for (int i = 0; i < gifts; i++) {
					String receiver = st.nextToken();

					friends.put(receiver, sum + friends.get(receiver));
				}
			}

			count++;
			
			if(st.nextToken() == null){
				break;
			}
			

		}//end of while loop

		for (String key : friends.keySet()) {

			out.println(key + " " + friends.get(key));
		}
		out.close();

	}// end of main    
}// end of class
