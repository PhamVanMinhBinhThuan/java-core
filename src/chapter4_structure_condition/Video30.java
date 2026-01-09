package chapter4_structure_condition;

import java.util.Scanner;

public class Video30 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap diem: ");
		double score = scanner.nextDouble();

		if (score >= 9 && score <= 10) {
			System.out.println("Ban dat xuat sac");
		} else if (score >= 8 && score < 9) {
			System.out.println("Ban dat gioi");
		} else if (score >= 6.5 && score < 8) {
			System.out.println("Ban dat kha");
		} else if (score >= 5 && score < 6.5) {
			System.out.println("Ban dat trung binh");
		} else if (score >= 0 && score < 5) {
			System.out.println("Ban dat yeu");
		} else {
			System.out.println("Khoang khong hop le");
		}

		scanner.close();
	}
}
