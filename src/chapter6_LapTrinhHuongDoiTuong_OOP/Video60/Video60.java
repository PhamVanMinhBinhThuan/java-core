package chapter6_LapTrinhHuongDoiTuong_OOP.Video60;

public class Video60 {
	public static void main(String[] args) {
		Student s = new Student("Pham Van Minh", "12");

		System.out.println(s.getName());

		s.setName("Pham Pham");
		System.out.println(s.getName());
	}
}
