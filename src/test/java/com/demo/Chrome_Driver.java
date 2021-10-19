package com.demo;

public class Chrome_Driver implements Web_Driver{

	public void get() {

		System.out.println("get");
		
	}

	public void getTitle() {

		System.out.println("get title");
		
	}

	public static void main(String[] args) {
		
		Chrome_Driver d = new Chrome_Driver();
		
		d.get();
		
		d.getTitle();
		
	}
	
	
}
