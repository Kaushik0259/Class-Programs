package com.demo;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class PriorityQueueDemo 
{

	public static void main(String[] args) 
	{
		PriorityQueue queue=new PriorityQueue();
		try
		{
			queue.add(null);
		}
		catch(NullPointerException ne)
		{
			System.out.println("Null value mat dalo");
		}
		//queue.add(12);
		//queue.add(1);
		//queue.add(4);
		System.out.println(queue);
		
		 //queue.remove(1);
		//System.out.println(queue.poll());	
		try {
			System.out.println(queue.remove());	
		}
		catch(NoSuchElementException ne)
		{
			System.out.println("object me kuch nahi hai");
		}
		
		System.out.println(queue.peek());
		
		
		
	}
}
