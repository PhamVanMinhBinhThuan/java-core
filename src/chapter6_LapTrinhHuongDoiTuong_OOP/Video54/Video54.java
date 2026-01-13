package chapter6_LapTrinhHuongDoiTuong_OOP.Video54;

public class Video54 {
	public static void main(String[] args) {
		Student sv1 = new Student();

		sv1.study();
		int sum = sv1.sum(3, 5);

		System.out.println("Sum: " + sum);
	}
}
