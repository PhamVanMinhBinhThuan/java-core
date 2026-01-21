package chapter13_java_input_output.Video132;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Video132 {
	public static void fileReaderExample() {
		try (FileReader file = new FileReader("src/chapter13_java_input_output/Video132/input.txt")) {
			int c;
			while ((c = file.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void fileWriterExample() {
		try (FileWriter fw = new FileWriter("src/chapter13_java_input_output/Video132/output.txt")) {
			fw.write("Hello World\n");
			fw.write("Hello World");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void printWriterExample() {
		try (PrintWriter pw = new PrintWriter("src/chapter13_java_input_output/Video132/output2.txt")) {
			pw.println("Hello, PrintWriter!");
			pw.printf("Number: %d, String: %s\n", 10, "Java");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
//		fileReaderExample();
//		fileWriterExample();
		printWriterExample();
	}
}
