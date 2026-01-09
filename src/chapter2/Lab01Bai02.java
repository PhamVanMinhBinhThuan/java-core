package chapter2;

import java.util.Scanner;

public class Lab01Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap canh 1: ");
		double a = scanner.nextDouble();
		System.out.print("Nhap canh 2: ");
		double b = scanner.nextDouble();

		double chuvi = (a + b) * 2;
		double dientich = a * b;
		double minCanh = Math.min(a, b);

		System.out.printf("Chu vi: %.3f \n", chuvi);
		System.out.printf("Dien tich: %.3f \n", dientich);
		System.out.printf("Canh nho nhat: %.3f \n", minCanh);

		scanner.close();
	}
}
