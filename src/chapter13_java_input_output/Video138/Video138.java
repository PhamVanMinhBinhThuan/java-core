package chapter13_java_input_output.Video138;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Video138 {
	public static void readFile() {
		String filePath = "src/chapter13_java_input_output/Video138/input.txt";

		try {
			byte[] data = Files.readAllBytes(Paths.get(filePath));

			System.out.println("Đã đọc file: " + filePath);
			System.out.println("Kích thước file: " + data.length + " bytes");
			System.out.println("Giá trị byte đầu tiên: " + data[0]);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void writeFile() {
		String filePath = "src/chapter13_java_input_output/Video138/output.txt";
		byte[] data = { 10, 20, 30, 40, 50 };
		try {
			Files.write(Paths.get(filePath), data);

			System.out.println("Đã ghi file: " + filePath);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
//		readFile();
		writeFile();
	}
}
