package com.demo;

/*
 * It is maintaining the insertion order
 * modification insertion and deletion of the data in array list is time consuming
 * Duplication null are allowed in array list
 * retrieval of data in array list is possible
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList list= new ArrayList();
		
		list.add(5);
		list.add("Kaushik");
		list.add(true);
		list.add(2.5);
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		System.out.println(list2.size());
		
		list2.remove("Two");
		list2.add(2, "Six");
		System.out.println(list2);
		
		Iterator iterator = list2.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
