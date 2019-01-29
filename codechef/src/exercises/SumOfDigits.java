package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigits {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			String n = br.readLine().trim();
			int sum = n.chars().map(Character::getNumericValue).sum();
			sb.append(Integer.toString(sum)).append("\n");
		}
		
		System.out.print(sb.toString().replaceAll("\\s+$", ""));
	}
	
}
