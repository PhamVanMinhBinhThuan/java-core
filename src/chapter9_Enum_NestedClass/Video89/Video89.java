package chapter9_Enum_NestedClass.Video89;

public class Video89 {
	public static void main(String[] args) {
		System.out.println("Role no enum: " + Role.ADMIN);
		System.out.println("Role with enum: " + MyRole.ADMIN);

//		String role = Role.ADMIN;
//		String role = "SUPERADMIN";		// Không báo lỗi

		MyRole myRole = MyRole.ADMIN; // Enum
//		MyRole test = "SUPERADMIN"; // Báo lỗi ngay
	}
}
