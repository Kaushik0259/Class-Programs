package com.demo;

class Rose {

public static void main (String args[]) {

	try{

		int j=0, x;

		x=(int) Double.parseDouble(args[j]);

		System.out.println(x/0);

		}catch(Exception e) {

			System.out.println("Hi");

		}

}

}