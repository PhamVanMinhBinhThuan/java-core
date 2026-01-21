package chapter12_generics.Lab10;

import java.util.List;

public class InventoryUtils {
	public static <T> void printItemInfo(InventoryItem<T> item) {
		System.out.println("ID: " + item.getId() + ", Name: " + item.getName() + ", Price: " + item.getPrice());
	}

	public static double calculateTotalPrice(List<InventoryItem<?>> items) {
		double sum = 0;

		for (InventoryItem<?> inventoryItem : items) {
			sum += inventoryItem.getPrice();
		}

		return sum;
	}
}
