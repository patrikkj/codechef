package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheLeadGame {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int n = Integer.parseInt(br.readLine());
		int score1 = 0, score2 = 0;
		int maxDiff1 = -1;
		int maxDiff2 = -1;
		
		for (int i = 0; i < n; i++) {
			String[] split = br.readLine().split("\\s");
			score1 += Integer.parseInt(split[0]);
			score2 += Integer.parseInt(split[1]);
			int diff = Math.abs(score2 - score1);
			
			if (score1 > score2  &&  diff > maxDiff1)
				maxDiff1 = diff;
			else if (score2 > score1  &&  diff > maxDiff2)
				maxDiff2 = diff;
		}
		
		if (maxDiff1 > maxDiff2)
			System.out.printf("%s %s", "1", maxDiff1);
		else 
			System.out.printf("%s %s", "2", maxDiff2);
	}
}
