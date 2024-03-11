public class ZombieDice extends BoardGames{
    private String specialItemsIncluded;
    // special items include things like special dice, cards, or game pieces

    public ZombieDice(String gameName, String gameType, String creator,
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
