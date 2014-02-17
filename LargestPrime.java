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

			/*populate the int array with the individual digits*/
			for(int x=0;x<length;x++){
				numbers[x]= Integer.parseInt(number.substring(x,x+1));
				//System.out.println(numbers[x]);
			}

			/*Check divisibility by two - (see) if the last digit is even*/
			//System.out.println("the last digit is: " + numbers[length-1]);
			if((numbers[length-1])%2 ==0){
				System.out.println("This number is a multiple of 2");
			}else{
				System.out.println("This number is NOT a multiple of 2");
			}
			/*Check divisibility by 3 - check if the sum of all digits is multiple of 3*/

			/*Check divisibility by 7 - try division, no rule other rules apply*/

			/*If all the checks fail, brute force it by checking divisibility from (11,sqty(n)]*/
		}catch(Exception e){
			System.out.println("Error");
		}	
	}
}