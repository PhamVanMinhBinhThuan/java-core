package chapter11_CollectionFramework.Video110;

import java.util.ArrayList;

public class Video110 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("HCM");
		list.add("Hanoi");
		list.add("Binh Thuan");
		list.add("HCM");

		for (String city : list) {
			System.out.print(city + " ");
		}
		System.out.println();

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1); // = list2.add(Integer.valueOf(1));
		list2.add(2);
		list2.add(3);

		for (Integer integer : list2) {
			System.out.print(integer + " ");
		}
	}
}
