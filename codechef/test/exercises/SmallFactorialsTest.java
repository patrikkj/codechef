package exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmallFactorialsTest {

	private final InputStream systemIn = System.in;
	private final PrintStream systemOut = System.out;

	private ByteArrayInputStream testIn;
	private ByteArrayOutputStream testOut;

	@BeforeEach
	public void setUpOutput() {
		testOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(testOut));
	}

	private void provideInput(String data) {
		testIn = new ByteArrayInputStream(data.getBytes());
		System.setIn(testIn);
	}

	private String getOutput() {
		return testOut.toString();
	}

	@AfterEach
	public void restoreSystemInputOutput() {
		System.setIn(systemIn);
		System.setOut(systemOut);
	}

	@Test
	public void testCase1() throws IOException {
		final String input = "4\n" + "1\n" + "2\n" + "5\n" + "3";
		final String output = "\n" + "1\n" + "2\n" + "120\n" + "6";

		provideInput(input);
		SmallFactorials.main(new String[0]);

		assertEquals(output, getOutput());
	}

	@Test
	public void testCase2() throws IOException {
		final String input = "3\n" + "10\n" + "2\n" + "1";
		final String output = "\n" + "3628800\n" + "2\n" + "1";

		provideInput(input);
		SmallFactorials.main(new String[0]);

		assertEquals(output, getOutput());
	}

}
