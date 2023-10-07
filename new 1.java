package com;

public class StaticDemo {
	static int a;
static {
	System.out.println("hello");
	  a=10;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sanju age"+ StaticDemo.a);
	}
	static {
		System.out.println("sanju");
		StaticDemo.a=20;
	}

}
