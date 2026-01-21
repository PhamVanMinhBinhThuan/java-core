package chapter11_CollectionFramework.Video115;

import java.util.HashSet;

public class Video115 {
	public static void main(String[] args) {
		Product p1 = new Product(1, "Laptop", 1500.0);
		Product p2 = new Product(2, "Mouse", 20.0);
		Product p3 = new Product(3, "Keyboard", 45.0);

		Product p4 = new Product(1, "Laptop Pro", 2000.0); // Trùng id với Laptop
		Product p5 = new Product(1, "Laptop", 1500.0); // Trùng tất cả thuộc tính với p1

		HashSet<Product> products = new HashSet<>();

		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);

		for (Product product : products) {
			System.out.println(product);
		}

		System.out.println();
		System.out.println("Xoa product co id = 3");
		products.remove(p3);
		for (Product product : products) {
			System.out.println(product);
		}
	}
}
