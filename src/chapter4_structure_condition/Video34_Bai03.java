package chapter4_structure_condition;

import java.util.Scanner;

public class Video34_Bai03 {
	public static void main(String[] args) {
		// Mat khau: 123456789
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Nhap mat khau");
			String matKhau = scanner.nextLine();

			if (matKhau.equals("123456789")) {
				System.out.println("Dang nhap thanh cong");
				break;
			} else {
				System.out.println("Sai mat khau, thu lai");
			}
		} while (true);

		scanner.close();
	}
}
