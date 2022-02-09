// Colten Wright
// Conversion of Kilometers to Miles - WrightC_J4C

import javax.swing.JOptionPane;

public class WrightC_J4C
{
   public static void main(String[] args)
   {
      //Double variables
      double miles, kilometers;
      //String variables
      String answer, answer2, answer3;
      //Char variables
      char choice;
      //Display Menu
      JOptionPane.showMessageDialog(null, "Would you like to convert"+ 
      "\n"+
      "\n       Miles to Kilometers?"+ 
      "\n                        or"+ 
      "\n       Kilometers to Miles?");
      //Recieve input
      answer = JOptionPane.showInputDialog("Type M for Miles to Kilometers"+
               "\nType K for Kilometers to Miles");
      choice = answer.charAt(0);
      //Determine conversion taking place
      switch (choice)
      {
         case 'M':
            JOptionPane.showMessageDialog(null, "You chose to convert Miles to Kilometers");
            //Receive number of miles from user
            answer2 = JOptionPane.showInputDialog("What is the number of Miles being converted to Kilometers?");
            miles = Double.parseDouble(answer2);
            //Display results
            JOptionPane.showMessageDialog(null, miles+ " Miles is equal to " +conversionKilometers(miles)+ " Kilometers.");
            break;
         case 'K':
            JOptionPane.showMessageDialog(null, "You chose to convert Kilometers to Miles");
            //Receive number of miles from user
            answer3 = JOptionPane.showInputDialog("What is the number of Kilometers being converted to Miles?");
            kilometers = Double.parseDouble(answer3);
            //Display results
            JOptionPane.showMessageDialog(null, kilometers+ " Kilometers is equal to " +conversionMiles(kilometers)+ " Miles.");
            break;
         default:
            JOptionPane.showMessageDialog(null, "A valid menu choice was not entered");
            System.exit(0);
      }      
   }
   
            //Create method showMiles
            
            /**
            conversionMiles performs the calulations to convert Kilometers into Miles
            @param kilometersInput is the amount of Kilometers input by the user to be converted into Miles
            @return is the calculated amount of Miles from Kilometers
            */
            
            public static double conversionMiles(double kilometersInput)
            {
               //Result of the calculation to convert to Miles
               double milesConversion;
               milesConversion = kilometersInput*.6124;
               return milesConversion;
            }
            
           //Create method showKilometers
            
            /**
            conversionKilometers performs the calulations to convert Miles into Kilometers
            @param milesInput is the amount of Miles input by the user to be converted into Kilometers
            @return is the calculated amount of Kilometers from Miles
            */
            
            public static double conversionKilometers(double milesInput)
            {
               //Result of the calculations to convert to Kilometers
               double kilometersConversion;
               kilometersConversion = milesInput/.6214;
               return kilometersConversion;
            }
}