/**
* Largest Prime Factorizer
*/

/**
* Class Name: LargestPrime	Programmer: Nadya Pena
* Decay a number into its prime factors and find the largest
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
	 			//System.out.println(i + " is a factor of " + in_number);

	 			if(prime.isPrime(i)){
	 				System.out.println(i + " IS A PRIME FACTOR");
	 			}
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
 	protected boolean isFactor(long in_number, long i){
	 	return in_number % i == 0;
 	}
 	/* 
	* Function that checks if a factor is a prime factor by seeing if the factor
	* is divisible by any number other than itself and one, starting at factor/2
 	*/
	protected boolean isPrime(long x){

		int prime_indicator = 0;
		long n = x/2;
		boolean final_indicator = false;

		for (; n >=2; n--){
			if(x % n == 0){
				prime_indicator++;
			} 
		}
		if(prime_indicator != 0){
			final_indicator = false;
		} else {final_indicator = true;}

	return final_indicator;
	}
}