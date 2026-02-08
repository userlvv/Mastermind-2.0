package mastermindthesecond;

import java.util.*;

public class RewrittenMastermind {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 0;
        int turns = 0;
        boolean won = false;
        HelperMM Helper = new HelperMM();
        String[] secret = new String[4];
        String[] guess = new String[4];
        Helper.intro();

        String answer1 = input.nextLine();
        if (!answer1.equalsIgnoreCase("Computer") && !answer1.equalsIgnoreCase("Player")) {
            System.out.println("Wrong form of input, try again.");
            input.close();
        }
//Computer Selected ======
		if (answer1.equalsIgnoreCase("Computer")) {
            System.out.println("Computer VS Player selected.");
            System.out.println("Debug Mode? Y/N");
        
//Debug Mode on or off ======
            String answer2 = input.nextLine();
         if (answer2.equalsIgnoreCase("y")) {
        	 secret = Helper.codeGeneratorDebug();
        	 for (i = 0; i < secret.length; i++) {
        		 System.out.println(secret[i]);
        	 }
            }
          else if (answer2.equalsIgnoreCase("n")) {
        	  secret = Helper.codeGeneratorDebug();
            } else {
                System.out.println("Wrong form of input, try again.");
                input.close();
            }
        
//Ten Turns + Code Input ======
         for (turns = 1; turns <= 10; turns++) {
         	System.out.println("Round: " + turns); 
         System.out.println("Choose 4 colors, 1 at a time:");
         for (i = 0; i < 4; i++) {
             guess[i] = Helper.readValidColor(input);
         }
//Code Checker (Needs to go to HelperMM) ======      
         won = Helper.codeChecker(secret, guess); 
         if (won) {
         	System.out.println("You have won! Restart for next round.");
         	input.close();
         	break;
         }
         else if (turns == 10) {
             System.out.println("You have lost! Restart for next round.");
             System.out.println("The code was:");
             for (i = 0; i < 4; i++) {
             System.out.println(secret[i]);
             input.close();
             }
             }
         }
        }
    
// !! Player Selected ======
        else if (answer1.equalsIgnoreCase("Player")) {
            System.out.println("Player VS Player selected.");
            System.out.println("The Code Maker can create the code by putting in the code. Don't let the Code Cracker see!");
            System.out.println("You can choose between the colors: red, blue, green, purple, orange and yellow");
            
            for (i = 0; i < 4; i++) {
                secret[i] = Helper.readValidColor(input);
            }
            Helper.emptyText();
        
//Ten Turns + Code Input ======
        for (turns = 1; turns <= 10; turns++) {
        	System.out.println("Round: " + turns); 
        	System.out.println("Choose 4 colors, 1 at a time:");
        for (i = 0; i < 4; i++) {
            guess[i] = Helper.readValidColor(input);
        }
//Code Checker (Needs to go to HelperMM) ======        
            won = Helper.codeChecker(secret, guess); 
            if (won) {
            	System.out.println("You have won! Restart for next round.");
            	input.close();
            	break;
            }
            else if (turns == 10) {
                System.out.println("You have lost! Restart for next round.");
                System.out.println("The code was:");
                for (i = 0; i < 4; i++) {
                System.out.println(secret[i]);
                input.close();
                
                }
            }
        }          
    }
    }
}