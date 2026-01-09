package chapter4_structure_condition;

public class Video36_Bai01 {
	public static void main(String[] args) {
		// Yeu cau 1
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.println("So dau tien chia het cho 7: " + i);
				break;
			}
		}

		// Yeu cau 1: So thu 3 chia het cho 7
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				count++;
				if (count == 3) {
					System.out.println("So thu 3 chia het cho 7: " + i);
					break;
				}
			}
		}

		// Yeu cau 2
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println("So chan: " + i);
		}
	}
}
