public class CthuluDice extends BoardGames{
    private String specialItemsIncluded;

    public CthuluDice(String gameName, String gameType, String creator,
                     Double currentPrice, int maxPlayerNum, Double playingTime,
                     String difficulty, Double starReviews) {

        super(gameName, gameType, creator, currentPrice, maxPlayerNum,
                playingTime, difficulty, starReviews);
    }

    public String getSpecialItemsIncluded(){
        return this.specialItemsIncluded = specialItemsIncluded;
    }
    public void setSpecialItemsIncluded(String specialItemsIncluded){
        this.specialItemsIncluded = specialItemsIncluded;
    }
}
