package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Two_Array {

	public static void main(String[] args) {

		Integer a[] = { 1, 2, 5, 6, 2, 3, 4 };

		List<Integer> list1 = Arrays.asList(a);

		List<Integer> list2 = new ArrayList<Integer>();

		// System.out.println("AAAAA");

		for (int i = 0; i < list1.size(); i++) {

			// System.out.println("ABC");

			for (int j = i + 1; j < list1.size(); j++) {

				if (list1.get(i) == list1.get(j)) {

					if (list2.contains(list1.get(j))) {

						continue;

					}

					list2.add(list1.get(j));

				}

			}

		}

		System.out.println(list2);

	}

}
