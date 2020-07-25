package com.epam.Java8_Lambdas_Stream;

import java.util.*;
import java.util.function.*;
public class Palindrome_List 
{
	public static void main(String args[])
	{
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Funny");
		arrayList.add("MALAYALAM");
		arrayList.add("racecar");
		arrayList.add("random");
		arrayList.add("civic");
		arrayList.add("star");
		arrayList.add("noon");
		arrayList.add("escape");
		
		System.out.println("List of strings are:");
		System.out.println(arrayList);
		Predicate<String> predicate = (String str) -> str.equals(new StringBuilder(str).reverse().toString());
		ArrayList<String> palindromes = getPalindromes(arrayList,predicate);
		System.out.println("\nPalindromes in the list are:");
		System.out.println(palindromes);
	}
	
	static ArrayList<String> getPalindromes(List<String> arrayList,Predicate<String> predicate)
	{
		ArrayList<String> palindrome_list=new ArrayList<String>();
		for(String string:arrayList)
		{
			if(predicate.test(string))
				palindrome_list.add(string);
		}
		return palindrome_list;
	}
	
	
}
