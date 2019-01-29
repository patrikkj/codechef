package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FindRemainder {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			String[] split = br.readLine().split(" ");
			int a = Integer.parseInt(split[0]);
			int b = Integer.parseInt(split[1]);
			sb.append(a % b).append('\n');
		}
		
		System.out.print(sb.toString().replaceAll("\\s+$", ""));
	}
	
}
