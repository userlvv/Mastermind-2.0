package mastermindthesecond;

import java.util.*;


public class Mastermindthesecond {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 0;
        int y = 0;
        boolean won = false;
        int black = 0;
        int turns = 0;
        
        String[] secret = new String[4];
        String[] colors = new String[6];

        colors[0] = "Red";
        colors[1] = "Blue";
        colors[2] = "Green";
        colors[3] = "Purple";
        colors[4] = "Orange";
        colors[5] = "Yellow";
        
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
        
        String answer1 = input.nextLine();
        if (answer1.equalsIgnoreCase("Computer") || answer1.equalsIgnoreCase("Player")) {
            if (answer1.equalsIgnoreCase("Computer")) {
                System.out.println("Computer VS Player selected.");
                System.out.println("Debug Mode? Y/N");
                String answer2;

                answer2 = input.nextLine();
                if (answer2.equalsIgnoreCase("y")) {
                    for (i = 0; i <= 3; i++) {
                        int rng = random.nextInt(6);
                        String color = colors[rng];
                        secret[i] = color;
                        System.out.println(secret[i]);
                    }
                }
                
                else if (answer2.equalsIgnoreCase("n")) {
                	for (i = 0; i <= 3; i++) {
                    int rng = random.nextInt(6);
                    String color = colors[rng];
                    secret[i] = color;
                }
                }
                
               
                else for (i = 0; i <= 3; i++) {
                    int rng = random.nextInt(6);
                    String color = colors[rng];
                    secret[i] = color;
                }
                for (turns = 1; turns <= 10; turns++) {
                	System.out.println("Round: " + turns); 
                System.out.println("Choose 4 colors, 1 at a time:");
                String[] guess = new String[4];

                for (i = 0; i < 4; i++) {
                    guess[i] = input.nextLine();
                }
                for (i = 0; i < 4; i++) {
                    String feedback;

                    feedback = "Gray";
                    if (secret[i].equalsIgnoreCase(guess[i])) {
                        feedback = "Black";
                        black = black + 1;
                    } else {
                        for (y = 0; y < 4; y++) {
                            if (secret[i].equalsIgnoreCase(guess[y])) {
                                feedback = "White";
                            } else {
                            	feedback = "Gray";
                            }
                            }
                        }
                System.out.println(feedback);
            }
                if (black == 4) {
                    turns = 10;
                    won = true;
                }
                black = 0;
                
            } 
            } else {
                System.out.println("Player VS Player selected.");
                if (answer1.equalsIgnoreCase("Player")) {
                    System.out.println("The Code Maker can create the code by putting in the code. Dont let the Code Cracker see!");
                    System.out.println("You can choose between the colors: red, blue, green, purple, orange and yellow");
                    for (i = 0; i < 4; i++) {
                        secret[i] = input.nextLine();
                    }
                    for (int skip = 0; skip < 50; skip++) {
                    	System.out.println("");
                    }
                    for (turns = 1; turns <= 10; turns++) {
                    	System.out.println("Round: " + turns); 
                    System.out.println("Choose 4 colors, 1 at a time:");
                    String[] guess = new String[4];
                    

                    for (i = 0; i < 4; i++) {
                        guess[i] = input.nextLine();
                    }
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
                                } else {
                                	feedback = "Gray";
                                }
                                }
                            }
                    System.out.println(feedback);
                    }
                    if (black == 4) {
                        turns = 10;
                        won = true;
                        
                    }
                    black = 0;
                }
            }
            }
            if (won == true) {
                System.out.println("You have won! Restart for next round.");
                input.close();
            } else {
                System.out.println("You have lost! Restart for next round.");
                System.out.println("The code was:");
                for ( i = 0; i < 4; i++) {
                System.out.println(secret[i]);
                }
        }
        } else {
            System.out.println("Wrong form of input, try again.");
        }
      }  
    }
