package chapter12_generics.Video122;

public class InventoryItem<T> {
	private T id;
	private String name;

	public InventoryItem(T id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "InventoryItem [id=" + id + ", name=" + name + "]";
	}

	public T getId() {
		return this.id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
