public class CardGames extends Games {
    private boolean usesJoker;

    public CardGames(String gameName, String gameType, String creator,
                     Double currentPrice, int maxPlayerNum, Double playingTime,
                     String difficulty, Double starReviews) {
        super(gameName, gameType, creator, currentPrice,
                maxPlayerNum, playingTime, difficulty, starReviews);
    }
    public boolean getUsesJoker(){
        return this.usesJoker;
        // usesJoker means is whether or not the card game includes the joker cards or not 
    }
    public void setUsesJoker(boolean usesJoker){
        this.usesJoker = usesJoker;
    }
}
