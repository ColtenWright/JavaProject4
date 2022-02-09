// Colten Wright
// Payment and Amortization calculator - WrightC_J4B

import java.util.Scanner;

public class WrightC_J4B
{
   public static void main(String[] args)
   {
      //Double variables
      double loanAmount, interestRate, paymentAmount;
      //Integer variables
      int payments;
      //Char variables
      char choice;
      //String variables
      String input;
      //Get user data
      Scanner keyboard = new Scanner(System.in);
      //Display menu
      System.out.println("Would you like to calculate a payment amount or create an amortization schedule?");
      System.out.println(" ");
      System.out.println("Enter P for payment amount.");
      System.out.println("Enter A for amortization schedule.");
      //Receive input from user
      input = keyboard.next();
      choice = input.charAt(0);
      //Execute the users choice
      switch (choice)
      {
         case 'P':
            //Get information from user
            System.out.println(" ");
            System.out.println("You chose to calculate a payment amount.");
            System.out.println(" ");
            System.out.println("What is the initial loan amount? ");
            loanAmount = keyboard.nextDouble();
            System.out.println(" ");
            System.out.println("What is the interest rate? (Ex: 5=5%)");
            interestRate = keyboard.nextDouble()/100;
            System.out.println(" ");
            System.out.println("How many payments will be made?");
            payments = keyboard.nextInt();
            //Display reuslts
            System.out.printf("\tLoan Amount: $%,10.2f\n ",loanAmount);
            System.out.println("\tInterest Rate: " +interestRate+ '%');
            System.out.println("\tNumber of Payments: "+payments);
            System.out.printf("The payment amount is $%,10.2f\n ",calcPayment(loanAmount, interestRate, payments));
            break;
         case 'A':
            System.out.println(" ");
            System.out.println("You chose to create an amortization schedule.");
            //Ask for loan amount
            System.out.println(" ");
            System.out.println("What is the loan amount?");
            loanAmount = keyboard.nextDouble();
            //Ask for # of payments
            System.out.println(" ");
            System.out.println("What is the number of payments?");
            payments = keyboard.nextInt();
            //Ask for interest rate
            System.out.println(" ");
            System.out.println("What is the interest rate?");
            System.out.println("(Enter interest rate as a decimal.)");
            interestRate = keyboard.nextDouble();
            //Ask for payment amount
            System.out.println(" ");
            System.out.println("What is the amount paid on the loan?");
            paymentAmount = keyboard.nextDouble();
            //Display results
            createAmortization(loanAmount, payments, interestRate, paymentAmount);
            break;
         default:
            System.out.println(" ");
            System.out.println("A valid memu choice was not entered.");
      }
   }

   //Create method calcPayment
   
   /**
   calcPayment is a method that takes the information input by the user in the main method and utilizes it to calculate the payment amount and return it
   @param loanAmount is the initial loan amount input by the user in the main method
   @param interestRate is the interest rate input by the user in the main method
   @param payments is the number of payments planning to be made input by the user in the main method
   @return paymentAmount is the calculated result returned to the main method
   */
   
   
   
   public static double calcPayment(double loanAmount, double interestRate, int payments)
   {
      //Double variables
      double paymentAmount;
      //Calculate the Payment Amount
      paymentAmount = loanAmount / ((Math.pow(1+interestRate,payments)-1)/(interestRate*Math.pow(1+interestRate,payments)));
      return paymentAmount;
   }
   
   //Create method createAmortization
   
   /**
   createAmortization is a method that calculates the values need to create an amortization schedule and the displays the results
   @param loanAmount is the initial loan amount input by the user in the main method
   @param payments is the number of payments input by the user in the main method
   @param interestRate is the interest rate input by the user in the main method
   @param paymentAmount is the amount being paid on the loan input by the user in the main method
   */
   
   
   public static void createAmortization(double loanAmount, int payments, double interestRate, double paymentAmount)
   {
      //Double Variables
      double interest, principle, newBalance;
      //Formatting
      System.out.println("Year  Balance     Interest    Principle   New Balance");
      System.out.println("---------------------------------------------------");
      //loop
      for (int year = 1; year <= payments; year++)
      {
         System.out.print(year + "\t\t");
         System.out.printf("$%,10.2f\t", loanAmount);
         interest = loanAmount * interestRate;
         System.out.printf("$%,10.2f\t", interest);
         principle = paymentAmount - interest;
         System.out.printf("$%,10.2f\t", principle);
         newBalance = loanAmount - principle;
         System.out.printf("$%,10.2f\t", newBalance);
         System.out.println(" ");
         loanAmount = newBalance;
      }
    } 
}   