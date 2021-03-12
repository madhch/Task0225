package org.madhu;

import java.util.ArrayList;

public class MainArrayList {
	
	public MainArrayList() {
		System.out.println("Weekdays :::");
		nameList.add("Monday");
		nameList.add("Tuesday");
		nameList.add("Wednesday");
		nameList.add("Thursday");	
		System.out.println("Weekday list "+ nameList);		
	}
	
	public ArrayList nameList = new ArrayList();
	
	public ArrayList <String> newList = new ArrayList <String> ();
	
	public ArrayList <StringBuffer> newBufferList = new ArrayList <StringBuffer> ();

		
	public void addName(String name) {
		System.out.println("Add missing day ::");
		System.out.println("printing the list before addition "+ nameList);
		nameList.add(name);
		System.out.println("printing the list after addition "+ nameList);
		
		StringBuffer sb =new StringBuffer("Sunday");
		nameList.add(sb);
		//sb.append("Saturday");
		//sb.append("sb");
		
		System.out.println(nameList);
		nameList.remove(sb);
		System.out.println("Weekdays:"+ nameList);
	}

	
	public static void main(String[] args) {
		
		MainArrayList demo = new MainArrayList();
		demo.addName("Friday");
	
		
    	}

}
