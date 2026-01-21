package chapter10_Exception.Lab08;

import java.util.Scanner;

public class Video106 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Nhap username: ");
			String username = scanner.nextLine();
			System.out.print("Nhap password: ");
			String password = scanner.nextLine();
			System.out.print("Nhap so du: ");
			double balance = scanner.nextDouble();
			System.out.print("Nhap so tien can rut: ");
			double amount = scanner.nextDouble();

			BankAccount myAccount = new BankAccount(username, password, balance);
			myAccount.withdraw(amount);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Giao dich ket thuc.");
		}
	}
}
