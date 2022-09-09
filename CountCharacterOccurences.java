package com.stringpractice;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountCharacterOccurences {

	public static void main(String[] args) {
		
		String str = "";
		
		System.out.println("enter the string : ");
		Scanner sc = new Scanner (System.in);
		str=sc.nextLine();
		
		//str.replace(" ", "");
		
		char [] ch = str.toCharArray();
		
		int count = 0;
		
		Map<Character,Integer> map = new TreeMap<>();
		
		for(int i = 0; i < ch.length; i++) {
			
			count = 0;
			
			for(int j = 0;j < ch.length;j++) {
				
				if(ch[i]==ch[j]) {
					
					count++;
				}
			}
			
			map.put(ch[i], count);			
		}
		System.out.println(map);

	}

}
