package com.demo;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class IteratorDemo
{

	public static void main(String[] args) 
	{
		LinkedList l1 = new LinkedList();
		l1.add("KAUSHIK");
		l1.add("A");
		l1.add(250);
		l1.add(25.9f);
		l1.add(null);
		l1.add(0);
		System.out.println("List is:"+l1);
		
		// by using iterator
//		LinkedList li = new LinkedList();
//		li.add(150);
//		li.add(51, list);
		System.out.println("Iterator List is:"+l1);
		Iterator iterator = l1.iterator();
		System.out.println("The List of Iterator is :"); 
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		// by using list iterator
		ListIterator l2 = l1.listIterator();
		
		 System.out.println("The Listof List Iterator is :"); 
		 
	       
	}
}