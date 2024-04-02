package com.demo;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set set = new LinkedHashSet();
		
		set.add(1);
		set.add('K');
		set.add('K');
		set.add('K');
		set.add("Kaushik");
		set.add(23);
		set.add(true);
		System.out.println(set);
		
		System.out.println(set.isEmpty());
		System.out.println(set.remove('k'));
		
		Set s1= new LinkedHashSet();
		s1.add("Vaibhav");
		s1.add("Om");
		
		System.out.println(set.addAll(s1));
		System.out.println(set);	

	}

}
