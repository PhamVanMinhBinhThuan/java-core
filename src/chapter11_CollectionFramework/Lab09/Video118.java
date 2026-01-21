package chapter11_CollectionFramework.Lab09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Video118 {
	public static void requirement1() {
		// Cach 1
//		Member m1 = new Member(1, "Ng A", 14);
//		Member m2 = new Member(2, "Ng B", 15);
//		Member m3 = new Member(3, "Ng C", 16);
//		Member m4 = new Member(4, "Ng D", 17);
//		Member m5 = new Member(5, "Ng E", 18);
//
//		ArrayList<Member> members = new ArrayList<>();
//		members.add(m1);
//		members.add(m2);
//		members.add(m3);
//		members.add(m4);
//		members.add(m5);

		// Cach 2
		List<Member> members = Arrays.asList(new Member(1, "Ng A", 14), new Member(2, "Ng B", 15),
				new Member(3, "Ng C", 16), new Member(4, "Ng D", 17), new Member(5, "Ng E", 18));

		for (Member member : members) {
			System.out.println(member); // member.toString()
		}
	}

	public static void requirement2() {
		Member m1 = new Member(10, "Ng A", 14);
		Member m2 = new Member(2, "Ng B", 15);
		Member m3 = new Member(33, "Ng C", 16);
		Member m4 = new Member(21, "Ng D", 17);
		Member m5 = new Member(5, "Ng E", 18);
		Member m6 = new Member(2, "Ng E", 18);

		HashSet<Integer> members = new HashSet<>();
		members.add(m1.getId());
		members.add(m2.getId());
		members.add(m3.getId());
		members.add(m4.getId());
		members.add(m5.getId());
		members.add(m6.getId());

		System.out.println(members);
	}

	public static void requirement3() {
		Member m1 = new Member(1, "Ng A", 24);
		Member m2 = new Member(2, "Ng B", 15);
		Member m3 = new Member(3, "Ng C", 36);
		Member m4 = new Member(4, "Ng D", 27);
		Member m5 = new Member(5, "Ag E", 15);
		Member m6 = new Member(4, "Ng D", 27);

		TreeSet<Member> members = new TreeSet<>();
		members.add(m1);
		members.add(m2);
		members.add(m3);
		members.add(m4);
		members.add(m5);
		members.add(m6);

		for (Member member : members) {
			System.out.println(member);
		}
	}

	public static void requirement4() {
		HashMap<Integer, Integer> pointMap = new HashMap<>();

		pointMap.put(2, 11);
		pointMap.put(3, 50);
		pointMap.put(1, 5);
		pointMap.put(16, 25);

		if (pointMap.containsKey(1)) {
			int currentPoint = pointMap.get(1);
			pointMap.put(1, currentPoint + 10);
		}

		System.out.println("Danh sach diem thuong");
		for (Map.Entry<Integer, Integer> entry : pointMap.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Point: " + entry.getValue());
		}
	}

	public static void requirement5() {
		Member m1 = new Member(10, "Ng A", 14);
		Member m2 = new Member(2, "Ng B", 15);
		Member m3 = new Member(33, "Ng C", 16);
		Member m4 = new Member(21, "Ng D", 17);
		Member m5 = new Member(5, "Ng E", 18);
		Member m6 = new Member(2, "Ng E", 18);

		ArrayList<Member> members = new ArrayList<>();
		members.add(m1);
		members.add(m2);
		members.add(m3);
		members.add(m4);
		members.add(m5);
		members.add(m6);

		TreeMap<Integer, String> idNameMap = new TreeMap<>();

		for (Member member : members) {
			idNameMap.put(member.getId(), member.getName());
		}

		System.out.println("TreeMap ID -> Name: ");
		for (Map.Entry<Integer, String> entry : idNameMap.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Point: " + entry.getValue());
		}
	}

	public static void main(String[] args) {
//		requirement1();
//		requirement2();
//		requirement3();
//		requirement4();
		requirement5();
	}
}
