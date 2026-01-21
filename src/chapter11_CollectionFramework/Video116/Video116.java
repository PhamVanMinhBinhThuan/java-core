package chapter11_CollectionFramework.Video116;

import java.util.HashMap;
import java.util.TreeMap;

public class Video116 {
	public static void hashMapExample() {
		System.out.println("Hash Map Example");
		HashMap<Integer, String> students = new HashMap<>();

		students.put(1, "Ng A"); // Thu tu khong dam bao
		students.put(20, "Ng B");
		students.put(3, "Ng C");
		students.put(5, "Ng D");
		students.put(1, "Ng A Update");

		System.out.println(students);
	}

	public static void treeMapExample() {
		System.out.println("Tree Map Example");
		TreeMap<Integer, String> students = new TreeMap<>();

		students.put(1, "Ng A"); // Sap xep thu tu theo key
		students.put(20, "Ng B");
		students.put(3, "Ng C");
		students.put(5, "Ng D");
		students.put(1, "Ng A Update");

		System.out.println(students);
	}

	public static void main(String[] args) {
		hashMapExample();
		System.out.println();
		treeMapExample();
	}
}
