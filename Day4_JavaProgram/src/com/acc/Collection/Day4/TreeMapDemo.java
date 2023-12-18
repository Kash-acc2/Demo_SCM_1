package com.acc.Collection.Day4;
import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		/*TreeMap<String,Integer> treemap = new TreeMap<String,Integer>();
		treemap.put("Raju", 75);
		treemap.put("Sneha", 60);
		treemap.put("Adithya", 100);
		treemap.put("Surya", 95);
//		treemap.put(null,50);
		
		for(Map.Entry m1:treemap.entrySet()) {
			System.out.println(m1.getKey() +" scored "+m1.getValue());
		}
		
		treemap.entrySet().stream().
		sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		treemap.remove("Sneha");
		System.out.println(treemap);*/
		
		NavigableMap<String,Integer> treemap = new TreeMap<String,Integer>();
		treemap.put("Raju", 75);
		treemap.put("Sneha", 60);
		treemap.put("Aakash", 74);
		treemap.put("Adithya", 100);
		treemap.put("Surya", 95);
		
	//	System.out.println(treemap.descendingMap());
		System.out.println(treemap);
		System.out.println(treemap.headMap("Sneha",true));
		System.out.println(treemap.tailMap("Raju",true));
	System.out.println(treemap.subMap("Aakash",false, "Raju",true));
		

	}

}
