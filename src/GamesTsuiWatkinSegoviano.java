/**

 Name: Sidney Tsui, Georgia Watkins, Enrique Segoviano
 Date: 03/15/2024
 Section: CSC331 = 003
 Program Purpose:Driver class
 */

import java.util.Scanner;
public class GamesTsuiWatkinSegoviano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Games[] VideoGames = {
                new MarioKart("MarioKart", "Video Game", "Nintendo", 59.99, 4, 4.0, "medium", 4.9),
                //new StardewValley(),
                //new Tetris(),
                //new Doom()
        };
        Games[] BoardGames = {
                //new ZombieDice(),
                //new Betrayal_at_House_on_the_Hill(),
                //new WarHammer(),
                // new Fluxx(),
                new PoetryForNeanderthals("Poetry for Neanderthals", "Board Game", "Exploding Kittens", 20.00, 12, 20.00, "hard", 4.8),
                //new CthuluDice(),
        };
        Games[] CardGames = {
                new SushiGo("Sushi Go", "Card Game", "Gamewright Games", 11.99, 5, 20.00, "easy", 4.7)
                //new LoveLetter()
        };
        System.out.println("What type of game would you like to play? (please enter an integer response)");
        System.out.println("1. Video Game");
        System.out.println("2. Board Game");
        System.out.println("3. Card Game");
        int option = scanner.nextInt();

        Games[] GameOfChoice;

        String category;
        switch (option) {
            case 1:
                category = " video game ";
                GameOfChoice = VideoGames;
                break;
            case 2:
                category = " board game ";
                GameOfChoice = BoardGames;
                break;
            case 3:
                category = " card game ";
                GameOfChoice = CardGames;
                break;
            default:
                System.out.println("Invalid input, please use only integers 1, 2, or 3");
                return;
        }

        System.out.printf("%s %-20s %-20s %-22s %-30s %-20s%n", "\t", "Game Name", "Cost", "Max Players", "Average Play Time", "Rating");
        System.out.println();
        for (int i = 0; i < GameOfChoice.length; i++) {
            Games game = GameOfChoice[i];
            System.out.printf("%-4d %-20s $%-20.2f %-22d %.2f %-23s  %-20.1f%n",
                    (i+1), game.getGameName(), game.getCurrentPrice(),
                    game.getMaxPlayerNum(), game.getPlayingTime(), "minutes" , game.getStarReviews());
        }
        System.out.println("Which" + category + "do you want to play?");
        int choice = scanner.nextInt() - 1;

        //Error handling if input is out of bounds
        if (choice < 0 || choice >= GameOfChoice.length) {
            System.out.println("Invalid input.Please enter a value from the options given.");
        }
        else {
           Games gameChoice = GameOfChoice[choice];
            System.out.printf("Details:%n");
            System.out.println(gameChoice.toString());
        }

        System.out.println("Are you sure this is the game you want to purchase? (Y/N)");
        scanner.nextLine();
        String confirm = scanner.nextLine();

        if (!confirm.equals("Y") && !confirm.equals("y")) {
            System.out.println("Your purchase has been cancelled!");
            return;
        }
        System.out.println("How many copies would you like to purchase?");
        int copies = scanner.nextInt();

        Games GameChoice = GameOfChoice[choice];
        double total = GameChoice.getCurrentPrice() * copies;
        System.out.println("Your total cost is: $" + total);

    }

}


//reminaing:::
// FIGURE OUT HOW TO DISPLAY THE UNIQUE VARIABLES PER CLASS
//  IDENTIFY  WHERE POLYMORPHISM IS
// COMMENTS
