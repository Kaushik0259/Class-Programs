package com.demo;
/*
 * You can also create your own exception sub class simply by extending java exception class.
 * and you can override the toString()
 * Function to display your customized message on catch.
 */

class MeraException extends ArrayIndexOutOfBoundsException
{
	private int ex;

	public MeraException(int ex) {
		super();
		this.ex = ex;
	}

	@Override
	public String toString() {
		return "MeraException [ex=" + ex + "]";
	}
	
}

public class UserDefinedException {

		static void sum(int a, int b)throws MeraException
		{
			if(a<0)
			{
				throw new MeraException(a);
			}
			else
			{
				System.out.println("The addition is:"+ (a+b));
			}
		}
	public static void main(String[] args) {
		
		//UserDefinedException ud= new UserDefinedException();
		try
		{
			sum(-10,10);
		}
		
		catch(MeraException e)
		{
			System.out.println(e);
		}
	}

}
