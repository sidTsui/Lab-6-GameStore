/**

 Name: Sidney Tsui, Georgia Watkins, Enrique Segoviano
 Date: 03/15/2024
 Section: CSC331 = 003
 Program Purpose:Driver class
 */

import java.util.Scanner;
public class GamesTsuiWatkinSegoviano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //import scanner class
        //polymorphism used when arrays of video, board, and card games are created and instances of each are implemented and assigned to teh same Games[] array
        Games[] VideoGames = { //implement instances of video games
                new MarioKart("MarioKart", "Video Game", "Nintendo", 59.99, 4, 4.0, "medium", 4.9),
                new StardewValley("Stardew Valley", "Video Game", "ConcernedApe", 14.99, 4, 14.2, "easy", 4.8),
                new Tetris("Tetirs", "Video Game", "Alexey Pajitnov", 37.49, 1, 180.00, "medium", 4.2),
                new Doom("Doom", "Video Game", "ID Software", 17.00, 4, 60.00, "medium", 4.6)
        };
        Games[] BoardGames = { //implement instances of board games
                new ZombieDice("Zombie Dice", "Board Game", "Steve Jackson Games", 24.95, 8, 20.00, "chance", 4.8),
                new Betrayal_at_House_on_the_Hill("Betrayal at House on the Hill", "Board Game", "Avalon Hill", 35.00, 6, 120.00, "chance", 4.8),
                new WarHammer("WarHammer", "Board Game", "Games Workshop", 110.00, 4, 108.00, "hard", 4.5),
                new PoetryForNeanderthals("Poetry for Neanderthals", "Board Game", "Exploding Kittens", 20.00, 12, 20.00, "hard", 4.8),
                new CthuluDice("Cthulu Dice", "Board Game", "Steve Jackson Games", 14.95, 6, 10.00, "Chance", 4.7),
        };
        Games[] CardGames = { // implement instance of card games
                new SushiGo("Sushi Go", "Card Game", "Gamewright Games", 11.99, 5, 20.00, "easy", 4.7),
                new LoveLetter("Love Letter", "Card Game", "Seiji Kanai", 20.98, 4, 20.00, "Medium", 4.8),
                new Fluxx("Fluxx", "Card Game", "Looney Labs", 25.00, 4, 30.00, "easy", 5.0),
        };
        System.out.println("What type of game would you like to play? (please enter an integer response)"); // ask user which type of game they want to play
        System.out.println("1. Video Game");
        System.out.println("2. Board Game");
        System.out.println("3. Card Game");
        int option = scanner.nextInt(); // get user input using only integers

        Games[] GameOfChoice; //stores array of Games in GameOfChoice (uses polymorphism)

        String category;//varr category stored selected game category
        switch (option) {//switch statement based on user input for option
            case 1: //if user inputs int 1
                category = " video game "; //sets category to string
                GameOfChoice = VideoGames; //assigns the array to varr GameOfChoice
                break;
            case 2:// if user inputs int 2
                category = " board game ";
                GameOfChoice = BoardGames;
                break;
            case 3: //if user inputs int 3
                category = " card game ";
                GameOfChoice = CardGames;
                break;
            default: //error handling, if any other input is entered
                System.out.println("Invalid input, please use only integers 1, 2, or 3");
                return;
        }

        System.out.printf("%s %-20s %-20s %-22s %-30s %-20s%n", "\t", "Game Name", "Cost", "Max Players", "Average Play Time", "Rating"); // specific formatting for subject headings
        System.out.println(); //formatting choice
        for (int i = 0; i < GameOfChoice.length; i++) {// loop through array
            Games game = GameOfChoice[i]; //get game when at index i
            System.out.printf("%-4d %-20s $%-20.2f %-22d %.2f %-23s  %-20.1f%n",
                    (i+1), game.getGameName(), game.getCurrentPrice(),
                    game.getMaxPlayerNum(), game.getPlayingTime(), "minutes" , game.getStarReviews());
        }
        System.out.println("Which" + category + "do you want to play?");
        int choice = scanner.nextInt() - 1; //subtract 1 from the user choice to align the array correctly so teh 0th array spot is the 1st choice

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
        String confirm = scanner.nextLine(); //takes user input as a string to confirm choice

        if (!confirm.equals("Y") && !confirm.equals("y")) { // if user inputs anything except for Y or y
            System.out.println("Your purchase has been cancelled!");
            return;
        }
        System.out.println("How many copies would you like to purchase?");
        int copies = scanner.nextInt(); // takes in user input as integer

        Games GameChoice = GameOfChoice[choice]; // get game based on user choice
        double total = GameChoice.getCurrentPrice() * copies; //calculate total cost
        System.out.println("Your total cost is: $" + total); //print total cost

    }

}


