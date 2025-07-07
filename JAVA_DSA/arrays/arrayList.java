package JAVA_DSA.arrays;

import java.util.ArrayList;

public class arrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list + " " + list.size());

		list.set(1, 200);
		System.out.println(list + " " + list.size());

		list.remove(1);
		System.out.print(list + " " + list.size());

	}
}