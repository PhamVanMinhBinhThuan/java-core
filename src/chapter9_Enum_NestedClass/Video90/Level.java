package chapter9_Enum_NestedClass.Video90;

public enum Level {

	HARD("Level Kho", 3), MEDIUM("Level trung binh", 2), EASY("Level de", 1);

	private final String description; // KHONG CO HAM SETTER
	private final int count;

	private Level(String description, int count) { // NEU KHONG GHI PRIVATE THI MAC DINH CUA NO CUNG LA PRIVATE
		this.description = description;
		this.count = count;
	}

	public String getDescription() {
		return this.description;
	}

	public int getCount() {
		return this.count;
	}
}
