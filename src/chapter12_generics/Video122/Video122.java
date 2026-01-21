package chapter12_generics.Video122;

public class Video122 {
	public static <T> void printArray(T[] myArr) {
		for (T t : myArr) {
			System.out.print(t + " - ");
		}
	}

	public static void main(String[] args) {
		System.out.println("----- Generics Class-----");
		InventoryItem<Integer> it1 = new InventoryItem<>(1, "Tu lanh");
		System.out.println("Item 1: " + it1);

		InventoryItem<String> it2 = new InventoryItem<>("SKU123", "May tinh");
		System.out.println("Item 2: " + it2);

		System.out.println();
		System.out.println("----- Generics Method-----");
		String[] names = { "Ng A", "Ng B", "Ng C" };
		Integer[] scores = { 10, 20, 16 };

		printArray(names);
		System.out.println();
		System.out.println();
		printArray(scores);
	}
}
