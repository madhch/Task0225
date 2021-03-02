package org.practice;

public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading obj = new Overloading();
		
		//int a = obj.add(24, 10);
		int a = obj.add(20, 10, 30);
		System.out.println(a);
		
		String s= obj.add("a", "b");
		System.out.println(s);

	}

}
