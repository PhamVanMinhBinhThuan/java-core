package chapter5_array_string;

public class Video44 {
	public static void main(String[] args) {
		double[] arr = { 9.5, 10.0, 9.7, 8.7, 9.6 };

		double sum = 0;

		for (double score : arr) {
			sum += score;
		}

		double averageScore = sum / arr.length;

		System.out.println("Tong diem: " + sum);
		System.out.println("Diem trung binh: " + averageScore);
	}
}
