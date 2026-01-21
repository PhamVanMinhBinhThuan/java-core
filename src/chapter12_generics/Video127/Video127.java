package chapter12_generics.Video127;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Video127 {
	public static void doSomething(List<? super Student> list) {
		// Read
		for (Object object : list) {
			System.out.println(object);
		}

		// Write
		list.add(new Student());
		list.add(new GraduateStudent());
//		list.add(new Person());			// Compile Error
	}

	public static void main(String[] args) {
		List<Student> listStudent = new ArrayList<>(Arrays.asList(new Student()));
		List<GraduateStudent> listGraduateStudent = new ArrayList<>(Arrays.asList(new GraduateStudent()));
		List<Person> listPerson = new ArrayList<>(Arrays.asList(new Person()));

		// Read
		doSomething(listStudent);
//		doSomething(listGraduateStudent);	// Error
		doSomething(listPerson);
	}
}
