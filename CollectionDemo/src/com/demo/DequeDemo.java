package com.demo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.*;
public class DequeDemo
{

	public static void main(String[] args) 
	{
		Deque dq = new ArrayDeque();
//		dq.add(10);
//		dq.addAll(dq);
//		dq.addFirst(15);
//		//dq.addLast("Kaushik");
//		//dq.clear();
//		//dq.contains(dq);
//		System.out.println(dq);
		
		try
		{
			dq.add(23);
			dq.add(23.5);
			dq.add(259);
			dq.add(752);
			dq.add("KKK");
			//dq.addAll(null);
			dq.addFirst(50);
			dq.addLast(22);
			
		} 
		catch (NullPointerException  e)
		{
			System.out.println("Null Value");
		}
		System.out.println(dq);
	}

}