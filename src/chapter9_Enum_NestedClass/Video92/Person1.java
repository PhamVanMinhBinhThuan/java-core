package chapter9_Enum_NestedClass.Video92;

public class Person1 {
	// Staic Nested class
	private String name;
	private int age;

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	static class UserID {
		private String CCCD;
		private String address;

		public UserID(String CCCD, String address) {
			this.CCCD = CCCD;
			this.address = address;
		}

		public String getCCCD() {
			return CCCD;
		}

		public void setCCCD(String cCCD) {
			CCCD = cCCD;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
	}
}
