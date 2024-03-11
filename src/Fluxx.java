public class Fluxx extends CardGames{
    private String cardDesigner;
    // card designer is what company / person designed the deck of cards in use

    public Fluxx(String gameName, String gameType, String creator,
                     Double currentPrice, int maxPlayerNum, Double playingTime,
                     String difficulty, Double starReviews) {

        super(gameName, gameType, creator, currentPrice, maxPlayerNum,
                playingTime, difficulty, starReviews);
    }
    public String getCardDesigner(){
        return this.cardDesigner = cardDesigner;
    }
    public void setCardDesigner(String cardDesigner){
        this.cardDesigner = cardDesigner;
    }
}
