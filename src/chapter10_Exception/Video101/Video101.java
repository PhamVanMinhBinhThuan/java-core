package chapter10_Exception.Video101;

import java.util.Scanner;

public class Video101 {
	public static void checkScore(int score) {
		if (score < 0 || score > 10)
			throw new IllegalArgumentException("Diem khong hop le: phai tu 0 - 10");
		System.out.println("Diem cua ban: " + score);
	}

	public static void main(String[] args) {
		// Cách 1
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("Nhap vao 1 so nguyen: ");
//		int score = scanner.nextInt();
//
//		try {
//			checkScore(score);
//		} catch (IllegalArgumentException e) {
//			System.out.println("Loi: " + e.getMessage());
//		} finally {
//			System.out.println("Ket thuc chuong trinh");
//		}
//
//		scanner.close();

		// Cách 2
		System.out.print("Nhap vao 1 so nguyen: ");

		try (Scanner scanner = new Scanner(System.in)) {
			int score = scanner.nextInt();
			checkScore(score);
		} catch (IllegalArgumentException e) {
			System.out.println("Loi: " + e.getMessage());
		} finally {
			System.out.println("Ket thuc chuong trinh");
		}
	}
}
