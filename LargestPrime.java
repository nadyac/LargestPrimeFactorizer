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
			/*read the number input from user*/
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter the number you would like to factor");
			String number= scan.nextLine(); //read number as String

			/*gets the number of digits in the long*/
			int length= number.length();
			System.out.println("The number of digits in the number is: " + length);


			/*create int array to hold all of the digits*/
			int[] numbers= new int[length];


			for(int x=0;x<length;x++){
				numbers[x]= Integer.parseInt(number.substring(x,x+1));
				System.out.println(numbers[x]);
			}
		}catch(Exception e){
			System.out.println("Error");
		}	
	}
}