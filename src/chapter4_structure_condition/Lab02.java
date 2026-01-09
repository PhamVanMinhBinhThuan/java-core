package chapter4_structure_condition;

import java.util.Scanner;

public class Lab02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double score;
		double sum = 0, count = 0;

		do {
			System.out.print("Nhap diem tu 0 - 10, nhap -1 de dung: ");
			score = scanner.nextDouble();

			if (score >= 0 && score <= 10) {
				sum += score;
				count++;
			} else if (score != -1) {
				System.out.println("Diem khong hop le. Nhap lai");
				continue;
			}
		} while (score != -1);

		System.out.println("=========MENU=========");
		System.out.println("1. Tinh diem trung binh");
		System.out.println("2. Phan loai hoc luc");
		System.out.println("3. Thoat chuong trinh");

		System.out.print("Nhap lua chon: ");
		int choice = scanner.nextInt();

		double dtb = sum / count;
		switch (choice) {
		case 1:
			System.out.printf("Diem trung binh: %.2f", dtb);
			System.out.println();
			break;
		case 2:
			if (dtb >= 9 && dtb <= 10) {
				System.out.println("Xep loai: Xuat sac");
			} else if (dtb >= 8 && dtb < 9) {
				System.out.println("Xep loai: Gioi");
			} else if (dtb >= 6.5 && dtb < 8) {
				System.out.println("Xep loai: Kha");
			} else if (dtb >= 5 && dtb < 6.5) {
				System.out.println("Xep loai: Trung binh");
			} else {
				System.out.println("Xep loai: Yeu");
			}
			break;
		case 3:
			return;
		default:
			break;
		}

		scanner.close();
	}
}
