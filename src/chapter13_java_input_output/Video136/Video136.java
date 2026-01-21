package chapter13_java_input_output.Video136;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Video136 {
	public static void fileInputStreamExample() {
		try (FileInputStream fis = new FileInputStream("src/chapter13_java_input_output/Video136/demo.jpg");) {

			int sizeInBytes = fis.available(); // available trả về số byte có thể đọc
			double sizeInMB = (double) sizeInBytes / (1024 * 1024);
			System.out.printf("Kích thước file: %.2f MB\n", sizeInMB);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void fileOutputStreamExample() {
		try (FileInputStream fis = new FileInputStream("src/chapter13_java_input_output/Video136/demo.jpg");
				FileOutputStream fos = new FileOutputStream("src/chapter13_java_input_output/Video136/output.jpg")) {

			int b;
			while ((b = fis.read()) != -1) {
				fos.write(b);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
//		fileInputStreamExample();
		fileOutputStreamExample();
	}
}
