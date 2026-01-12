package mastermindthesecond;

import java.util.*;

public class HelperMM {
	private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);
	static void intro() {
		System.out.println("                  _                      _           _  ");
        System.out.println("  /\\/\\   __ _ ___| |_ ___ _ __ _ __ ___ (_)_ __   __| |");
        System.out.println(" /    \\ / _` / __| __/ _ \\ '__| '_ ` _ \\| | '_ \\ / _` |");
        System.out.println("/ /\\/\\ \\ (_| \\__ \\ ||  __/ |  | | | | | | | | | | (_| |");
        System.out.println("\\/    \\/\\__,_|___/\\__\\___|_|  |_| |_| |_|_|_| |_|\\__,_|");
        System.out.println("");
        System.out.println("You can choose between the colors: red, blue, green, purple,");
        System.out.println("orange, yellow, pink, cyan and brown.");
        System.out.println("Black = Correct color on correct position.");
        System.out.println("White = Correct color on incorrect position.");
        System.out.println("Gray = Incorrect color on incorrect position.");
        System.out.println("");
        System.out.println("Player VS Player or Computer VS Player?");
        System.out.println("Answer with 'Player' or 'Computer':");
   	}
	public static String[] colorInfo() {
		String[] colors = new String[9];
        colors[0] = "Red";
        colors[1] = "Blue";
        colors[2] = "Green";
        colors[3] = "Purple";	
        colors[4] = "Orange";
        colors[5] = "Yellow";
        colors[6] = "Pink";
        colors[7] = "Cyan";
        colors[8] = "Brown";
		return colors;
	}
	public static String[] codeGeneratorDebug() {//code Gen + Show
	    String[] secret = new String[4];
	    for (int i = 0; i < 4; i++) {
	        int rng = random.nextInt(9);
	        String color = HelperMM.colorInfo()[rng];
	        secret[i] = color; 
	        }
	    return secret;
	}
	public static String[] codeGeneratorNoDebug() {//code Gen - Show
		String[] secret = new String[4];
	    for (int i = 0; i < 4; i++) {
	        int rng = random.nextInt(9);
	        String color = HelperMM.colorInfo()[rng];
	        secret[i] = color; 
	        }
	    return secret;
	}		
	public static boolean inputCheck(String input) {//Checks input with all colors
		String[] colors = colorInfo(); 
			for (int i = 0; i < 9; i++) { 
			if (colors[i].equalsIgnoreCase(input)) { 
			    return true; 
			     }
	}
			   return false; 
			   
	}	
	public static String readValidColor(Scanner input) {//Gets colors and outputs result
		String colors;
		while (true) {//infin loop
			colors = input.nextLine(); 
				if (inputCheck(colors)) {
					return colors;
			        }
			       	System.out.println("Invalid input. Choose from: red, blue, green, purple, orange, yellow, pink, cyan or brown");
			}
	}
	public static void emptyText() {//Empty text for PvP
	for (int skip = 0; skip < 50; skip++) {
	    System.out.println("");
	}
	}
	public static boolean codeChecker(String[] secret, String[] guess) {
		 int black = 0;
		 int y = 0;
		 int i = 0;
		 boolean won;
	for (i = 0; i < 4; i++) {
    	String feedback;
        feedback = "Gray";
        if (secret[i].equalsIgnoreCase(guess[i])) {
            feedback = "Black";
            black = black + 1;
        } else {
            for (y = 0; y < 4; y++) {
                if (secret[i].equalsIgnoreCase(guess[y]) && y != i) {
                    feedback = "White";
                    
                }
                }
            }
    System.out.println(feedback);
}
	return black == 4;
	}
}


