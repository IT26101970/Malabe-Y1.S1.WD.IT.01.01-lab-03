import java.util.Scanner;

public class IT26101970Lab3Q2 {
    
    public static void main(String[] args){

        // Declaring the variables
        double otHours, otHourlyRate, monthlySalary, otAmount, totalSalary;

        // Create the Scanner input
        Scanner input = new Scanner (System.in);

        // Getting the Monthly Salary
        System.out.println("Enter the monthly salary: ");
        monthlySalary = input.nextDouble();

        // Getting the number of OT hours
        System.out.println("Enter the number of OT hours: ");
        otHours = input.nextDouble();

        // Getting the OT hourly rate
        System.out.println("Enter the OT hourly rate: ");
        otHourlyRate = input.nextDouble();

        // Calculating the OT amount
        otAmount = otHours * otHourlyRate;

        // Calculating the total salary
        totalSalary = monthlySalary + otAmount;

        // Printing the output
        System.out.println(" ");
        System.out.println("The total salary including OT is: " + totalSalary);

    }
}
