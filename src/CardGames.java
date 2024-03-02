public class CardGames extends Games {
    private boolean usesJoker;

    public CardGames(String gameType, String creator, String platform,
                     Double currentPrice, String playerNum, Double playingTime,
                     String difficulty, int starReviews) {
        super(gameType, creator, platform, currentPrice,
                playerNum, playingTime, difficulty, starReviews);
    }
    public boolean getUsesJoke(){
        return this.usesJoker;
    }
    public void setUsesJoker(boolean usesJoker){
        this.usesJoker = usesJoker;
    }
}