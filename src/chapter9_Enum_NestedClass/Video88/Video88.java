package chapter9_Enum_NestedClass.Video88;

public class Video88 {
	public static void main(String[] args) {
		Student st = new Student();

		System.out.println("Country: " + st.country);
//		st.country = "Viet Nam"; 	// Error

//		st.printInfo();
		Student.printInfo();
	}
}
