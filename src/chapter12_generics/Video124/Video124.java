package chapter12_generics.Video124;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Video124 {
	public static <T> void printArrayWithGeneric(List<T> myArr) {
//		myArr.add((T) "Hello World");

		for (T t : myArr) {
			System.out.print(t + " - ");
		}
	}

	public static void printArrayWithUnbound(List<?> myArr) {
//		myArr.add((String) "Hello World"); // Error

		for (Object object : myArr) {
			System.out.print(object + " - ");
		}
	}

	public static void main(String[] args) {
		String[] names = { "Ng A", "Ng B", "Ng C" };
		ArrayList<String> namesArr = new ArrayList<>(Arrays.asList(names));

		printArrayWithGeneric(namesArr);
		System.out.println();
		printArrayWithUnbound(namesArr);
	}
}
