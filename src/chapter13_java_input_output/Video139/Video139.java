package chapter13_java_input_output.Video139;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Video139 {
	public static void handleCopy() {
		try (FileInputStream fis = new FileInputStream("src/chapter13_java_input_output/Video139/demo.mp3");
				FileOutputStream fos = new FileOutputStream("src/chapter13_java_input_output/Video139/output.mp3");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {

			long start = System.currentTimeMillis();
			int b;
			while ((b = bis.read()) != -1) {
				bos.write(b);
			}
			long end = System.currentTimeMillis();

			long duration = end - start;
			System.out.println("Copy completed in " + duration + " ms");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		handleCopy();
	}
}
