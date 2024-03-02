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

        switch (option) {
            case 1:
                GameOfChoice = VideoGames;
                break;
            case 2:
                GameOfChoice = BoardGames;
                break;
            case 3:
                GameOfChoice = CardGames;
                break;
            default:
                System.out.println("Invalid input, please use only integers 1, 2, or 3");
                return;
        }

        System.out.println("Game Name \t Cost \t Max Players \t Average Play Time \t Rating");
        for (int i = 0; i < GameOfChoice.length; i++) {
            Games game = GameOfChoice[i];
            System.out.println(i + 1 + "\t" + game.getGameName() + "\t" + game.getCurrentPrice()
                    + "\t" + game.getMaxPlayerNum() + "\t" + game.getPlayingTime() +
                    "\t" + game.getStarReviews());
        }
        System.out.println("Which" + option + "do you want to play?");
        int choice = scanner.nextInt() - 1;

        //Error handling if input is out of bounds
        if (choice < 0 || choice >= GameOfChoice.length) {
            System.out.println("Invalid input.Please enter a value from the options given.");
            return;
        }

        Games GameChoice = GameOfChoice[choice];
        System.out.println(GameChoice);
        System.out.println("Are you sure this is the game you want to purchase? (Y/N)");
        scanner.nextLine();
        String confirm = scanner.nextLine();

        if (!confirm.equals("Y") && !confirm.equals("y")) {
            System.out.println("Your purchase has been cancelled!");
            return;
        }
        System.out.println("How many copies would you like to purchase?");
        int copies = scanner.nextInt();

        double total = GameChoice.getCurrentPrice() * copies;
        System.out.println("Your total cost is: $" + total);

    }

}


//reminaing:::
//  IDENTIFY POLYMORPHISM
// USE OVERRIDDEN TOSTRING METHOF TO DISPLAY ALL INFO ABOUT SELECTED GAME
// COMMENTS