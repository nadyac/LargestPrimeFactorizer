/**
* Class Name: LargestPrime	Programmer: Nadya Pena
* Decay a number into its prime factors and find the largest
*
*/
import java.util.Scanner;
import java.io.*;

public class LargestPrime{

	public static void main(String[] args) throws Exception{

		try{
			/*
			* read the number input from user
			*/
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter the number you would like to factor");
			String number= scan.nextLine(); //read number as String

			/*
			* get the number of digits in the number entered by the user
			*/
			int length= number.length();
			//System.out.println("The number of digits in the number is: " + length);


			/*
			*create int array to hold all of the digits
			*/
			int[] numbers= new int[length];

			/*
			* populate the int array with the individual digits
			* sum the digits to see if the number is a multiple of 3
			*/
			int sum_of_numbers=0;
			for(int x=0;x<length;x++){
				numbers[x]= Integer.parseInt(number.substring(x,x+1));
				//System.out.println(numbers[x]);
				sum_of_numbers= sum_of_numbers+numbers[x];
			}
			System.out.println("The sum of all the digits is " + sum_of_numbers);
			int divisibility_indicator=0;
			/*
			* Check divisibility by two - see if the last digit is even
			*/
			if((numbers[length-1])%2 ==0){
				System.out.println("This number is a multiple of 2");
				divisibility_indicator = 1;
			}else{
				System.out.println("This number is NOT a multiple of 2");
				divisibility_indicator = 0;
			}

			/*
			* Check divisibility by 3 - check if the sum of all digits is multiple of 3
			*/
			if((sum_of_numbers)%3 == 0){
				System.out.println("This number is a multiple of 3");
				divisibility_indicator++;
			}else{
				System.out.println("This number is NOT a multiple of 3");
				divisibility_indicator = 0;
			}

			/*
			* Check divisibility by 7 - try division, no other rules apply
			* Note: number is read as a String, integer conversion must happen 
			*		before we may apply the Mod function to number.
			*/
			if((Integer.valueOf(number))%7 == 0){
				System.out.println("This number is a multiple of 7");
				divisibility_indicator++;
			}else{
				System.out.println("This number is NOT a multiple of 7");
				divisibility_indicator = 0;
			}

			/*If all the checks fail, brute force it by checking divisibility from (11,sqrt(n)]*/	
				
			System.out.println("This number has " + divisibility_indicator + " prime factors");

		}catch(Exception e){
			System.out.println("Error");
		}	
	}
}