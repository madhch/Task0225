package org.practice;

public class Overloading {
	public int add (int x, int y) {
		return x + y;
	}
	//overloaded method 
	public int add (int x ,int y,int z) {
		return x+ z + y;
	}
	public String add(String a, String b )	{
		return a.concat(b);
	}

}