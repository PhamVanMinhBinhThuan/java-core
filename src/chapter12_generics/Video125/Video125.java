package chapter12_generics.Video125;

import java.util.Arrays;
import java.util.List;

public class Video125 {
	public static void printNumbers(List<? extends Number> list) {
		for (Number n : list) {
			System.out.print(n + " - ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printNumbers(Arrays.asList(1, 2, 3, 4, 5));
		printNumbers(Arrays.asList(1.8, 2.7, 3.4, 4.4, 5.8));
	}
}
