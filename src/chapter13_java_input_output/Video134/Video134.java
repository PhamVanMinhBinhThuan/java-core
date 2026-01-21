package chapter13_java_input_output.Video134;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Video134 {
	public static void readFile() {
		List<String> lines;
		try {
			lines = Files.readAllLines(Paths.get("src/chapter13_java_input_output/Video134/input.txt"));
			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void writeFile() {
		List<String> lines = Arrays.asList("Hello, java.nio.file.Files!", "This is write() example.");

		try {
			Files.write(Paths.get("src/chapter13_java_input_output/Video134/output.txt"), lines);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		readFile();
		writeFile();
	}
}
