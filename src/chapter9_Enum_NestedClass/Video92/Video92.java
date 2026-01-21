package chapter9_Enum_NestedClass.Video92;

public class Video92 {
	public static void main(String[] args) {
		// Inner class
		Person NgA = new Person("NgA", 19);

		Person.UserID myData = NgA.new UserID("123456", "BinhThuan");

		System.out.println("---- Inner Class ----");
		System.out.println("Name: " + NgA.getName());
		System.out.println("CCCD: " + myData.getCCCD());
		myData.printInfo();
		System.out.println("----------------------");

		// Static Nested Class
		Person1 NgB = new Person1("NgB", 19);

		Person1.UserID myData1 = new Person1.UserID("654321", "TuyPhong");

		System.out.println("---- Static Nested Class ----");
		System.out.println("Name: " + NgB.getName());
		System.out.println("CCCD: " + myData1.getCCCD());
		System.out.println("----------------------");

		//
	}
}
