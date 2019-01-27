package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddTwoNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String[] split = br.readLine().split("\\s");
			int a = Integer.parseInt(split[0]);
			int b = Integer.parseInt(split[1]);
			sb.append(a + b).append('\n');
		}

		System.out.print(sb);
	}

}
