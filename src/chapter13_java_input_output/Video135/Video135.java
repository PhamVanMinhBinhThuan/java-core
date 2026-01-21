package chapter13_java_input_output.Video135;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Video135 {
	public static void writeData(List<Student> students, double avrageScore) {
		try (FileWriter fw = new FileWriter("src/chapter13_java_input_output/Video135/report.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);) {

			pw.println("===== STUDENT REPORT =====");
			pw.printf("%-12s %-7s %-8s\n", "Name", "Score", "Pass/Fail");
			pw.println("--------------------------");

			for (Student student : students) {
				String status = student.getScore() >= 5.0 ? "PASS" : "FAIL";
				pw.printf("%-12s %5.2f   %-8s\n", student.getName(), student.getScore(), status);
			}

			pw.println("-------------------------");
			pw.printf("Average Score: %.2f\n", avrageScore);
			pw.println("=========================");

			System.out.println("Report generated successfully to report.txt");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void handleReadWriteFile() {
		try (FileReader fr = new FileReader("src/chapter13_java_input_output/Video135/students.txt");
				BufferedReader br = new BufferedReader(fr);) {

			List<Student> list = new ArrayList<>();
			String line;
			while ((line = br.readLine()) != null) {
//				System.out.println(line);
				String[] temp = line.split(",");

				String name = temp[0];
				double score = Double.valueOf(temp[1]);

				list.add(new Student(name, score));
			}

//			for (Student student : list) {
//				System.out.println(student);
//			}

			double sum = 0;
			for (Student student : list) {
				sum += student.getScore();
			}

			double averageScore = sum / list.size();
			writeData(list, averageScore);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		handleReadWriteFile();
	}
}
