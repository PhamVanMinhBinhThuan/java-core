package chapter11_CollectionFramework.Video112;

import java.util.ArrayList;

public class Video112 {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();

		Student st1 = new Student("Alice", 20);
		Student st2 = new Student("Bob", 22);
		Student st3 = new Student("Charlie", 21);

		students.add(st1);
		students.add(st2);
		students.add(st3);

		System.out.println("Danh sach ban dau");
		for (Student student : students) {
			System.out.println(student.toString());
		}

		System.out.println();
		System.out.println("Sau khi them vao index = 1");
		Student st4 = new Student("David", 23);
		students.add(1, st4);
		for (Student student : students) {
			System.out.println(student.toString());
		}

		System.out.println();
		System.out.println("Sau khi xoa index = 0");
		students.remove(0);
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}
}
