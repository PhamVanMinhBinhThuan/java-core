package chapter5_array_string;

import java.util.Scanner;

public class Video41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] a = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("Nhap so nguyen thu " + (i + 1) + " : ");
			a[i] = scanner.nextInt();
		}

		int max = a[0];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			if (a[i] > max)
				max = a[i];
			sum += a[i];
		}

		System.out.println("Tong cac so: " + sum);
		System.out.println("So lon nhat: " + max);

		scanner.close();
	}
}
