public class CthuluDice extends BoardGames{
    private String characterName;

    public CthuluDice(String gameName, String gameType, String creator,
                     Double currentPrice, int maxPlayerNum, Double playingTime,
                     String difficulty, Double starReviews) {

        super(gameName, gameType, creator, currentPrice, maxPlayerNum,
                playingTime, difficulty, starReviews);
    }



    public String getCharacterName(){
        return this.characterName = characterName;
    }
    public void setCharacterName(String characterName){
        this.characterName = characterName;
    }
}
