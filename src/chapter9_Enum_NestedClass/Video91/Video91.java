package chapter9_Enum_NestedClass.Video91;

import java.util.Scanner;

public class Video91 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap trang thai don hang: ");
		String input = scanner.nextLine().toUpperCase();

		try {
			OrderStatus status = OrderStatus.valueOf(input);
			System.out.println("Trang thai: " + status.getDescription());
			System.out.println("Trang thai cuoi cung: " + status.hasFinal());
		} catch (Exception e) {
			System.out.println("Trang thai khong hop le!");
		}
		scanner.close();
	}
}
