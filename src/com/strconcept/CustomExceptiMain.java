package com.strconcept;

class Validate extends Exception{
	public Validate(String msg) {
		super(msg);
	}
}

public class CustomExceptiMain {
	

	public static void main(String[] args) {
		int age = 19;
		try {
			if(age<18) {
				throw new Validate("person is not eligible for vote");
			}
			else
			{
				System.out.println("The person is eligible for vote");
			}
		}catch(Validate v) {
			System.out.println(v.getMessage());
		}

		

	}

}
