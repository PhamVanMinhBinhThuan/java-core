package chapter13_java_input_output.Video133;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Video133 {
	public static void bufferReaderExample() {
		try (FileReader fr = new FileReader("src/chapter13_java_input_output/Video133/input.txt");
				BufferedReader br = new BufferedReader(fr)) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void bufferWriterExample() {
		try (FileWriter fw = new FileWriter("src/chapter13_java_input_output/Video133/output.txt");
				BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write("Hello, BufferedWriter!");
			bw.newLine(); // xuống dòng
			bw.write("This is fast writing example.");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
//		bufferReaderExample();
		bufferWriterExample();
	}
}
