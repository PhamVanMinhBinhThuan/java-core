package chapter6_LapTrinhHuongDoiTuong_OOP.Video55;

public class Video55 {
	public static void main(String[] args) {
		Employee nv1 = new Employee();
		Employee nv2 = new Employee();

		nv1.name = "Ng A";
		nv1.salary = 10000;

		nv2.name = "Ng B";
		nv2.salary = 15000;

		nv1.showInfo();
		nv2.showInfo();
	}
}
