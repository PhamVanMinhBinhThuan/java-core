package chapter6_LapTrinhHuongDoiTuong_OOP.Lab04.Video60;

import chapter6_LapTrinhHuongDoiTuong_OOP.Lab04.Model.Employee;

public class Video60 {
	public static void main(String[] args) {
		Employee nv1 = new Employee("Ng A", 25, "Sales", 8000.0);
		Employee nv2 = new Employee("Ng B", 30, "IT", 10000.0);

		System.out.println("==BEFORE RAISE==");
		nv1.showInfo();
		System.out.println("----------------");
		nv2.showInfo();
		System.out.println("----------------");

		nv1.raiseSalary(1.2);
		nv2.raiseSalary(1.2);
		System.out.println("==AFTER RAISE==");
		nv1.showInfo();
		System.out.println("----------------");
		nv2.showInfo();
		System.out.println("----------------");
	}
}
