package com.goavega.naming;

import java.util.Scanner;

public class Addition {

	

	public static void main(String[] args) {
		String name="mahi";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=sc.nextInt();
		System.out.println("Enter second number: ");
		int b=sc.nextInt();
		
		int c=a+b;
		System.out.println("Addition is "+c);
		
		
		Addition obj=new Addition();
		obj.doZ(name);
		System.out.println(add());
		
	}
	
	
	
	
	
	public static String add() {
		return "Wa re wa";
	}
	
	public void doZ(String name) {
		System.out.println(name);
	}

}
