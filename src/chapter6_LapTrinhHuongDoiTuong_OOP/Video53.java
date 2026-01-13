package chapter6_LapTrinhHuongDoiTuong_OOP;

public class Video53 {
	public static void main(String[] args) {
		Student sinhVien1 = new Student();

		sinhVien1.age = 19;
		sinhVien1.name = "Pham Pham";

		System.out.println("Sinh vien 1: " + sinhVien1.name + ", co tuoi: " + sinhVien1.age);

		sinhVien1.learnJava();
	}
}
