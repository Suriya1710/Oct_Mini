package com.demo;

public class Variables_Demo {

	static int age;

	public static int method1() {

		int age = 10;

		return age;

	}

	public static void method2() {
		 age = 16;

		System.out.println(age);

	}

	public static void method3() {

		System.out.println(age);

	}

	public static void main(String[] args) {

		int value = method1();
		System.out.println(value);

		method3();

	}

}
