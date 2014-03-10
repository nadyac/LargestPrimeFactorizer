/**
* Largest Prime Factorizer
*/

/**
* Class Name: LargestPrime	Programmer: Nadya Pena
* Decay a number into its prime factors and find the largest
*
* Variables:
*	1) scan: Scanner object that scans the inputted number
*
*
*
*/
import java.util.Scanner;
import java.io.*;

public class Primes{

	public static void main(String[] args){

		/*
		* Variable declarations and Primes object creation
		*/			
		Scanner scan= new Scanner(System.in);
		long in_number= scan.nextLong();
		long max_number = in_number/2;
		boolean isfactor = true;
	  	Primes prime = new Primes();
	  	/*
	  	* Read the number input by user
	  	*/ 
	  	System.out.println("Please enter the number you would like to factor");

	  	/*
	  	* Loop through the possible factors in decreasing order (largest to smallest)
	  	*/
	  	for(long i = max_number; i >= 2; i--){

	  	 prime.isFactor(in_number, max_number);
	  	}
	}
	/*
	* Empty Constructor
	*/
	protected void Primes(){};
 	/*
	* Function that returns a boolean indicating whether the number is a factor of the inputted number or not
 	*/
 	public boolean isFactor(long in_number,long max_number){
 		if(in_number % max_number == 0){
 			System.out.println("FLUFF");
 			System.out.println(max_number + " is a factor of " + in_number);
 		}
 		return true;
 	}
 	/* 
	* Function that returns a number if it is a prime factor of the inputted number
 	*/
}