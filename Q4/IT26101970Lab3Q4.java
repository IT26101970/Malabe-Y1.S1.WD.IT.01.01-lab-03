import java.util.Scanner;

public class IT26101970Lab3Q4{
	
	public static void main(String[] args){
		
		// Declaring and initializing the variables
		int number = 0;
		
		int count10000 = 0;
		int count1000 = 0;
		int count100 = 0;
		int count10 = 0;
		int count1 = 0;
		
		// Creating a scanner object to read input
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the five-digit number
		System.out.print("Enter a five-digit number: ");
		number = input.nextInt();
		
		// Calculate the individual digits in the number entered
		count10000 = number / 10000;
		number = number % 10000;
		
		count1000 = number / 1000;
		number = number % 1000;		
		
		count100 = number / 100;
		number = number % 100;	
		
		count10 = number / 10;
		number = number % 10;	
		
		count1 = number / 1;
		number = number % 1;	
		
		// Print the output
		System.out.println();
		System.out.print(count10000 + " ");
		System.out.print(count1000 + " ");
		System.out.print(count100 + " ");
		System.out.print(count10 + " ");
		System.out.print(count1);
		
	}
}