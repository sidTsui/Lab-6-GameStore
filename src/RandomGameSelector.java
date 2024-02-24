/**

 Name: Sidney Tsui, Georgia Watkins, Enrique Segoviano
 Date: 03/15/2024
 Section: CSC331 = 003
 Program Purpose: forms an array of games, chooses 12 randomly
 */
//source: help from inclass lecture slides, and javatpoint.com

public class RandomGameSelector {
    public static void main(String[] args) {
        //initializing array of strings
        String[] games = {"Betrayal at House on the Hill", "Crokinole", "Cthulu Dice", "Doom", "Dungeons & Dragons",
                "Escape: Curse of the Temple", "Everdell", "Fluxx", "Hollow Knight", "Loonacy", "Love Letter",
                "Mario Kart", "Mysterium", "Night Cage", "Pathfinder", "Play Me", "Poetry for Neanderthals",
                "Roll for It", "Root", "Stardew Valley", "Sushi Go", "Tetris", "Ticket To Ride", "Warhammer",
                "World of Warcraft", "Zombie Dice"};

        System.out.println("12 Randomly Selected Games: \n"); //heading

        for (int i = 0; i < 12; ) {//loops to make sure only 12 exist
            int random = (int) (Math.random() * games.length);//random element within range 1-26
            if (games[random] != "") {//checking if value exists
                System.out.println(games[random]); //prints game if it is not empty("")
                games[random] = "";//delete game when slected so it cannot be chosen again
                i++;
            }
        }
    }
}
