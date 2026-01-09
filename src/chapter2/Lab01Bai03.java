package chapter2;

import java.util.Scanner;

public class Lab01Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap canh: ");
		float a = scanner.nextFloat();

		float theTich = a * a * a;

		System.out.printf("The tich hinh lap phuong: %.2f", theTich);

		scanner.close();
	}
}
