package com.string101__to__140;

public class CompareStrings {

	public static void main(String[] args) {
		
		String name = "jayshree";
		
		String name1 = new String ("jayshree");
		
		String name2 = "jayshree";
		
		System.out.println("comapre two strings with each other");
		
		System.out.println(name.compareTo(name1));
		
		System.out.println(name==name2);
		
		System.out.println(name.equals(name1));		
		
		/*equals() method Compares this string to the specified object. 
		The result is true if and only if the argument is not null and 
		is a String object that represents the same sequence of characters as this object.
		Overrides:equals in class Object*/

	}

}
