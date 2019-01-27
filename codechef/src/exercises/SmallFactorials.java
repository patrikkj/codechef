package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SmallFactorials {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("\n");
		String line = br.readLine();
		final int n = Integer.parseInt(line);

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			sb.append(fac(num)).append('\n');
		}

		System.out.print(sb.toString().replaceAll("\\s+$", ""));
	}

	private static BigInteger fac(int n) {
		BigInteger num = BigInteger.ONE;
		for (int i = 2; i <= n; i++)
			num = num.multiply(new BigInteger(Integer.toString(i)));
		return num;
	}
}
