/*
	Jamie Steck and CSIS 293 FA19 0939
	Nov 13, 2019
	FavoriteMethods.java
	A collection of our favorite useful (static) methods
	Dependencies: none
	Credit: none
*/

import java.util.Random;

public class FavoriteMethods
{
	public static void main(String[] parameters)
	{
		//the purpose of this program is to create a collection of useful (static) methods
		//methods that could be used in many different programs
		//methods that could be useful for future projects!
		//each person can add in a method that they think is useful
		//it can be something new or something we've done in the past
		//so write the method and then test it out
		
		//here is Prof Steck's:
		System.out.println("Prof Steck:  Generate a random number in range...");
		int ranNum = randomNumber(2,10);
		System.out.println(ranNum);
		//is it an even number?
		 System.out.println("Is it an even number? " + isEvenNumber(ranNum));
		
		//here is Pat Sullivan's:
		System.out.println("Pat Sullivan: Simulating a d20 dice...");
		d20();
		

	}//end main method

	//randomNumber() returns a random number in the given range (between low and high, inclusive)
	public static int randomNumber(int low, int high)
	{
		Random ranGen = new Random();
		int ranNum = ranGen.nextInt(high-low+1) + low;
		return ranNum;
	}
	
	//d20 method, uses the randomNumber method to simulate a 20 sided dice
	public static void d20()
	{
		int roll = randomNumber(1,20);
		System.out.printf("User has rolled a %d!%n", roll);
		if(roll == 1)
		{
			System.out.println("Critical Fail!");
		}
		else if(roll == 20)
		{
			System.out.println("Critical Success!");
		}
	}
	
	//Nhi adds: isEvenNumber() method to check if the random number is an even number 
	public static boolean isEvenNumber(int ran){
		boolean found;
		if(ran % 2 == 0){
		    found = true;
		}
		else{
		    found = false;
		}
		return found;
   	}

}//end class
