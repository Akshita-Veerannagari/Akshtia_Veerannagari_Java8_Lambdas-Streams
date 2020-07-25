package com.epam.Java8_Lambdas_Stream;

import java.util.*;
public class Average_Of_List {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		for(int i=1;i<=5;i++)
		{
			arrayList.add(i+10);
		}
		find_avg(arrayList);

	}
	static void find_avg(ArrayList<Integer> arrayList)
	{
		Double average = arrayList.stream().mapToDouble(value -> value).average().orElse(0.0);
		System.out.println(average);
	}

}
