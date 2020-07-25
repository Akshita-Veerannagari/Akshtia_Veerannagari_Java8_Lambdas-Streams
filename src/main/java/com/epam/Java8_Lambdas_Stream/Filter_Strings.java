package com.epam.Java8_Lambdas_Stream;

import java.util.*;
import java.util.stream.Collectors;
public class Filter_Strings {
	
	public static void main(String args[])
	{
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("ask");
		arrayList.add("cat");
		arrayList.add("Zebra");
		arrayList.add("art");
		arrayList.add("act");
		arrayList.add("actor");
		arrayList.add("Ant");
		arrayList.add("APT");
		arrayList.add("flower");
		arrayList.add("Asking");
		
		List<String> solution = filterString(arrayList);
		System.out.println("The list of strings are: ");
		System.out.println(arrayList);
		System.out.println("\nThe list of strings starting with \"a\" (lower case) and of length 3 are:");
		System.out.println(solution);
	}
	
	static List<String> filterString(ArrayList<String> arrayList)
	{
		return arrayList.stream()
				  .filter(s -> s.startsWith("a"))
				  .filter(s -> s.length() == 3)
				  .collect(Collectors.toList());
	}

}
