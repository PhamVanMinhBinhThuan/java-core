package chapter12_generics.Lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Video128 {
	public static void main(String[] args) {
		InventoryItem<Integer> it1 = new InventoryItem<>(1001, "Laptop Dell", 1500.0);
		InventoryItem<String> it2 = new InventoryItem<>("SKU12345", "iPhone 15", 1200.0);

		InventoryUtils.printItemInfo(it1);
		InventoryUtils.printItemInfo(it2);

		List<InventoryItem<?>> list = new ArrayList<>(Arrays.asList(it1, it2));
		System.out.println("Total price: " + InventoryUtils.calculateTotalPrice(list));
	}
}
