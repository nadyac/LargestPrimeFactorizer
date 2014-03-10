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
	  	* Read the number input by user
	  	*/ 
	  	System.out.println("Please enter the number you would like to factor");
		/*
		* Variable declarations and Primes object creation
		*/			
		Scanner scan= new Scanner(System.in);
		long in_number= scan.nextLong();
		long max_number = in_number/2;
	  	Primes prime = new Primes();

	  	/*
	  	* Loop through the possible factors in decreasing order (largest to smallest)
	  	*/
	  	for(long i = max_number; i >= 2; i--){

	 		if(prime.isFactor(in_number, i)){
	 			System.out.println(i + " is a factor of " + in_number);
	 		} 
		}
	}
	/*
	* Empty Constructor
	*/
	protected void Primes(){};
 	/*
	* Function that returns a boolean indicating whether the number is a factor of the inputted number or not
 	*/
 	protected boolean isFactor(long in_number, long n){
	 	return in_number % n == 0;
 	}
 	/* 
	* Function that checks if a factor is a prime factor 
 	*/
 	
}