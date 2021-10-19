package com.interview;

import java.util.Arrays;
import java.util.List;

public class Array_Data {

	public static void main(String[] args) {

		Integer a[] = { 0, 1, 2, 3, 4 };

		Integer b[] = { 1, 2, 3 };

		List<Integer> list = Arrays.asList(a);

		List<Integer> list1 = Arrays.asList(b);

		for (int i = 0; i < list.size(); i++) {

			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i) == list.get(j)) {

					if (list1.contains(list.get(j))) {
						continue;
					}
					list1.add(list.get(j));
				}

			}

		}

		System.out.println(list1);

	}

}
