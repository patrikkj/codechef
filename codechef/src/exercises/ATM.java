package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATM {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final double FEE = 0.5;
		
		String line = br.readLine();
		String[] split = line.split("\\s");
		
		double amount = Double.parseDouble(split[0]);
		double balance = Double.parseDouble(split[1]);
		double out = balance - FEE - amount;

		if (out < 0  ||  amount % 5 != 0)
			System.out.print(balance);
		else
			System.out.print(out);
		
		br.close();
	}
}
