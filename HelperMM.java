package mastermindthesecond;

import java.util.*;

public class HelperMM {
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
	public String[] colorInfo() {
		String[] colors = new String[6];
        colors[0] = "Red";
        colors[1] = "Blue";
        colors[2] = "Green";
        colors[3] = "Purple";	
        colors[4] = "Orange";
        colors[5] = "Yellow";
		return colors;
	}
	
	
	
	}
	


