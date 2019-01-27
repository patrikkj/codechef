package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnormousInput {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] split = br.readLine().split(" ");
		final int n = Integer.parseInt(split[0]);
		final int k = Integer.parseInt(split[1]);
		int count = 0;
		
		String line = br.readLine();
		do {
			int num = Integer.parseInt(line);
			if (num % k == 0)
				count++;
			line = br.readLine();
		} while (line != null);
		
		System.out.print(count);
	}

}
