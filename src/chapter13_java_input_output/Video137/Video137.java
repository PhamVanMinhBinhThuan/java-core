package chapter13_java_input_output.Video137;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Video137 {
	public static void bufferedOutputStreamExample() {
		try (FileInputStream fis = new FileInputStream("src/chapter13_java_input_output/Video137/demo.jpg");
				FileOutputStream fos = new FileOutputStream("src/chapter13_java_input_output/Video137/output.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {

			int b;
			while ((b = bis.read()) != -1) {
				bos.write(b);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		bufferedOutputStreamExample();
	}
}
