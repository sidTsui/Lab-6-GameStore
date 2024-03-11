public class SushiGo extends CardGames{
    private String cardDesigner;
    // card designer is the name of the person / company who designed the deck of cards 
    
    public SushiGo(String gameName, String gameType, String creator,
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

