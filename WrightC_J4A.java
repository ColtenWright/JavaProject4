// Colten Wright
// Olympic Score Calculator - WrightC_J4A

import javax.swing.JOptionPane;

public class WrightC_J4A
{
   public static void main(String[] args)
   {
      //Double Variables
      double score1, score2, score3, score4, score5;
      //Get judges score from the user
      score1 = getScore();
      score2 = getScore();
      score3 = getScore();
      score4 = getScore();
      score5 = getScore();
      //Give getLowest and getHighest scores
      getLowest(score1, score2, score3, score4, score5);
      getHighest(score1, score2, score3, score4, score5);
      //Display athletes score
      calcScore(score1, score2, score3, score4, score5);
      System.exit(0);
   }
   
   //Create method getScore
   
   /**
   getScore recieves input from the user to determine the 5 judges scores
   @return score is the input that is returned back into the main method to be used by the other methods
   */
   
   public static double getScore()
   {
      double score;
      String answer;
      do
      {
      answer = JOptionPane.showInputDialog("What was the score given by the judge?");
      score = Double.parseDouble(answer);
         if (score <= 0 && score >= 10)
         {
            return score;
         }
         else
         {
            JOptionPane.showMessageDialog(null, "An invalid score was entered. Please end the program and try again.");
            return 0;
         }
      }
      while (score <= 0 && score >= 10);
   }
   
   //Create method calcScore
   
   /**
   calcScore is a method that removes the highest and lowest scores then averages the remaining three to calculate the athletes final score then displays it
   @param score1 is the first judges score input by the user using the getScore method
   @param score2 is the second judges score input by the user using the getScore method
   @param score3 is the third judges score input by the user using the getScore method
   @param score4 is the fourth judges score input by the user using the getScore method
   @param score5 is the fifth judges score input by the user using the getScore method
   */
   
   public static void calcScore(double score1, double score2, double score3, double score4, double score5)
   {
      //Double variable
      double sumScores, calculatedScore;
      //Calculate final score
      sumScores = score1 + score2 + score3 + score4 + score5;
      calculatedScore = (sumScores - (getHighest(score1, score2, score3, score4, score5) + getLowest(score1, score2, score3, score4, score5)))/3;
      JOptionPane.showMessageDialog(null, "The athletes final score is: " +calculatedScore);      
   }
   
   //Create method getLowest
   
   /**
   @param score1 is the first judges score input by the user using the getScore method
   @param score2 is the second judges score input by the user using the getScore method
   @param score3 is the third judges score input by the user using the getScore method
   @param score4 is the fourth judges score input by the user using the getScore method
   @param score5 is the fifth judges score input by the user using the getScore method
   @return lowest is the lowest out of all five score input by the user
   */
   
   public static double getLowest(double score1, double score2, double score3, double score4, double score5)
   {
       //Double variable
       double lowest;
       //Set max to compare to scores
       double max = 10;
       //Find the lowest score
       if (score1 <= max)
       {
         lowest = score1;
       }
       else
       {
         lowest = max;
       }
       if (score2 < lowest)
       {
         lowest = score2;
       }
       else
       {
         //lowest = lowest;
       }
       if (score3 < lowest)
       {
         lowest = score3;
       }
       else
       {
         //lowest = lowest;
       }
       if (score4 < lowest)
       {
         lowest = score4;
       }
       else
       {
         //lowest = lowest;
       }
       if (score5 < lowest)
       {
         lowest = score5;
       }
       else
       {
         //lowest = lowest;
       }
       return lowest;
   }
   
   //Create method getHighest
   
   /**
   @param score1 is the first judges score input by the user using the getScore method
   @param score2 is the second judges score input by the user using the getScore method
   @param score3 is the third judges score input by the user using the getScore method
   @param score4 is the fourth judges score input by the user using the getScore method
   @param score5 is the fifth judges score input by the user using the getScore method
   @return highest is the highest out of all five score input by the user
   */
   
   public static double getHighest(double score1, double score2, double score3, double score4, double score5)
   {
      //Double variable
      double highest;
      //Set min to compare to scores
      double min = 0;
      if (score1 >= min)
      {
        highest = score1;
      }
      else
      {
        highest = min;
      }
      if (score2 > highest)
      {
        highest = score2;
      }
      else
      {
        //highest = highest;
      }
      if (score3 > highest)
      {
        highest = score3;
      }
      else
      {
        //highest = highest;
      }
      if (score4 > highest)
      {
        highest = score4;
      }
      else
      {
        //highest = highest;
      }
      if (score5 > highest)
      {
        highest = score5;
      }
      else
      {
        //highest = highest
      }
      return highest;
   }
      
}