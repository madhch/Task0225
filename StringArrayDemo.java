package org.practice;
		
		public class StringArrayDemo {

			public static void main(String[] args) {
				//String
						String s = "Selenium";
						System.out.println(s.hashCode());
						System.out.println(s.toUpperCase());
				//StringBuffer		
						StringBuffer sb = new StringBuffer("java");
						System.out.println(sb.isEmpty());
						System.out.println(s.length() + sb.length()); 
				//Array
						String[] month = {"January", "February", "March", "April","May","June"};
						month[0]= "December";
						System.out.println(month[0]);
						for(int i =0; i <month.length ; i++) {
							System.out.println(month[i]);
						}
						for
						(String i : month) {
							System.out.println(i + " " + s.repeat(1)+ " " + sb.reverse());
						}

			}

		}
	


