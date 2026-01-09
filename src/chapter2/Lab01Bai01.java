package chapter2;

import java.util.Scanner;

public class Lab01Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap ten sinh vien: ");
		String name = scanner.nextLine();
		System.out.print("Nhap diem trung binh sinh vien: ");
		double score = scanner.nextDouble();

		System.out.printf("%s co diem = %.3f", name, score);

		scanner.close();
	}
}
