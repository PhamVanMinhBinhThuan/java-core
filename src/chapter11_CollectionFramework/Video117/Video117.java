package chapter11_CollectionFramework.Video117;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Video117 {
	public static void iteratorExample() {
		System.out.println("---- Iterator ----");
		ArrayList<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("C#");
		languages.add("PHP");
		languages.add("C++");
		languages.add("JavaScript");

		Iterator<String> languagesIterator = languages.iterator();
		while (languagesIterator.hasNext()) {
			String lang = languagesIterator.next();
			if (lang.equals("C#"))
				languagesIterator.remove();
		}

//		languagesIterator = languages.iterator();
//		while (languagesIterator.hasNext()) {
//			String lang = languagesIterator.next();
//			System.out.print(lang + " ");
//		}

		for (String lang : languages) {
			System.out.print(lang + " ");
		}
	}

	public static void listIteratorExample() {
		System.out.println("---- List Iterator ----");
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(5);
		nums.add(12);
		nums.add(9);
		nums.add(8);

		ListIterator<Integer> li = nums.listIterator();

		System.out.println("Duyệt xuôi:");
		while (li.hasNext()) {
			System.out.print(li.next() + " ");
		}
		System.out.println();

		System.out.println("Duyệt ngược:");
		while (li.hasPrevious()) {
			System.out.print(li.previous() + " ");
		}
		System.out.println();

		// Thêm phần tử 25 vào sau 5
//		li = nums.listIterator();
		while (li.hasNext()) {
			if (li.next() == 5) {
				li.add(25); // Thêm sau 5
			}
		}

		System.out.println("Sau khi thêm 25: " + nums);
	}

	public static void main(String[] args) {
		iteratorExample();
		System.out.println();
		listIteratorExample();

	}
}
