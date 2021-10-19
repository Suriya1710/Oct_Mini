package com.interview;

public class Like_Fibanoci_ {

	public static void main(String[] args) {

		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int temp = 0;

		// 1,3,5,7,9,11,13,15,17

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				temp = a[i] + a[j];

				System.out.println(temp);

				a[i] = a[j];

				a[j] = a[j + 1];

			}

		}

	}

}
