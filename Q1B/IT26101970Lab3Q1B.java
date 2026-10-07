import java.util.Scanner;

public class IT26101970Lab3Q1B{

    public static void main(String[] args){
        
        // Declare the variables
        double quantity, pricePerKg, discount, totalAmount;

        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Getting the price of 1Kg rice
        System.out.println("Enter the price of 1Kg rice: ");
        pricePerKg = input.nextDouble();

        // Getting the number of Kg
        System.out.println("Enter the number of kilograms of rice you want to buy: ");
        quantity = input.nextDouble();

        // Calculating the total amount
        totalAmount = pricePerKg * quantity;

        // Calculating the discount
        discount = (totalAmount * 10) / 100 ;

        // Calculating the total after discount
        totalAmount = totalAmount - discount;

        // Displaying the total amount
        System.out.println(" ");
        System.out.println("The total amount with the 10% discount is: " + totalAmount);

    }
}