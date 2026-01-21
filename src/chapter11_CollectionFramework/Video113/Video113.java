package chapter11_CollectionFramework.Video113;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Video113 {
	public static void hashSetExample() {
		System.out.println("Run Hash Set");
		HashSet<Integer> hashSet = new HashSet<>();

		hashSet.add(20); // Khong dam bao thu tu
		hashSet.add(3);
		hashSet.add(10);
		hashSet.add(14);
		hashSet.add(20); // Tu dong xoa phan tu trung

		System.out.println("Hash Set: " + hashSet);

		ArrayList<Integer> arrayList = new ArrayList<>();

		arrayList.add(20); // Dam bao thu tu
		arrayList.add(3);
		arrayList.add(10);
		arrayList.add(14);
		arrayList.add(20); // Khong dong xoa phan tu trung

		System.out.println("Array List: " + arrayList);
	}

	public static void treeSetExample() {
		System.out.println("Run Tree Set");
		TreeSet<Integer> treeSet = new TreeSet<>();

		treeSet.add(20); // Sap xep thu tu tang dan
		treeSet.add(3);
		treeSet.add(10);
		treeSet.add(14);
		treeSet.add(20); // Tu dong xoa phan tu trung

		System.out.println("Tree Set: " + treeSet);

		ArrayList<Integer> arrayList = new ArrayList<>();

		arrayList.add(20); // Dam bao thu tu
		arrayList.add(3);
		arrayList.add(10);
		arrayList.add(14);
		arrayList.add(20); // Khong dong xoa phan tu trung

		System.out.println("Array List: " + arrayList);
	}

	public static void main(String[] args) {
		hashSetExample();
		System.out.println();
		System.out.println();
		treeSetExample();
	}
}
