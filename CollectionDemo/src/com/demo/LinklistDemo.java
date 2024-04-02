package com.demo;

import java.util.LinkedList;

public class LinklistDemo {

	public static void main(String[] args) {
// Linked list is maintaining insertion order
// Linked list allowed the duplication values
// it allows null values also
		LinkedList list= new LinkedList();
		list.add(1);
		list.add("K");
		list.add("K");
		list.add("String");
		list.add("Kaushik");
		list.add(2.59);
		list.add(null);
		
		System.out.println(list);
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
	}

}
