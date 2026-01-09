package chapter4_structure_condition;

import java.util.Scanner;

public class Video29 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap diem: ");
		double score = scanner.nextDouble();

		if (score >= 9) {
			System.out.println("Ban dat xuat sac");
		} else if (score >= 8) {
			System.out.println("Ban dat gioi");
		} else if (score >= 7) {
			System.out.println("Ban dat trung binh");
		} else {
			System.out.println("Ban can co gang!!!");
		}

		scanner.close();
	}
}
