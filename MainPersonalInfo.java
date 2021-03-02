package org.practice;

public class MainPersonalInfo {

	public static void main(String[] args) {
		//Parameterized constructor
				PersonalInfo d = new  PersonalInfo( "Smith ","John ",10201978);
				d.printDetails(); 
				//System.out.println(d.firstName + d.lastName);
				System.out.println("BankAccount::" + d.bankAccount(223546383));
				
				Utility1 e = new Utility1();
				System.out.println(e.elctricity() + 300);
				System.out.println(e.dueDate() + 50);
				//overriding(from superclass)
				System.out.println(e.bankAccount(33333333));
				d.printDetails();
				Utility2 w = new Utility2();
				System.out.println("BankAccount::" + d.bankAccount(2124568886));
				w.water();
				w.payDate();
				//overriding(from subclass)
				w.bankAccount();
				
			}
			}