package chapter5_array_string;

import java.util.Scanner;

public class Lab03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] names = new String[3];
		double[] scores = new double[3];

		for (int i = 0; i < 3; i++) {
			System.out.print("Nhap vao ten hoc sinh " + (i + 1) + ": ");
			names[i] = scanner.nextLine();
			System.out.print("Nhap vao diem hoc sinh " + (i + 1) + ": ");
			scores[i] = scanner.nextDouble();
			scanner.nextLine();
		}

		System.out.println("Danh sach hoc sinh: ");
		for (int i = 0; i < 3; i++) {
			System.out.println(names[i] + " - " + scores[i]);
		}

		double averageScore = (scores[0] + scores[1] + scores[2]) / 3;
		System.out.printf("Diem trung binh: %.2f", averageScore);
		System.out.println();

		System.out.println("Hoc sinh co diem >=8: ");
		for (int i = 0; i < 3; i++) {
			if (scores[i] >= 8) {
				System.out.println(names[i] + " - " + scores[i]);
			}
		}

		scanner.close();
	}
}
